package team.rapj.ptt.dao;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.io.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Specific implementation of json data storage
 *
 * @author Kuihong Chen
 */
public class DataImpl extends BaseConnection {
    public static <T> List<T> loadData(Class clazz) throws Exception {
        String readContent = readContent();
        // if the data is null, return null list.
        if (readContent.equals("")) {
            return new ArrayList<>();
        }

        JSONObject jo = JSONObject.parseObject(readContent);
        String filter = getClassName(clazz);
        JSONArray filterJArray = (JSONArray) jo.get(filter);

        // Check if the corresponding json data is available in the file
        if (filterJArray.size() == 0) {
            return new ArrayList<>();
        }

        List<T> res = JSONObject.parseArray(filterJArray.toJSONString(), clazz);

        return res;
    }

    public static <T> void saveData(List<T> addModels) throws Exception {
        if (addModels.size() == 0) {
            return;
        }

        String tmp = readContent();
        JSONObject jo = (JSONObject) JSONObject.parse(tmp);

        /**
         * If firstly running app, the jo is null, which needs additional operations
         * to save data into file.
         */
        if (jo == null) {
            jo = new JSONObject();
        }

        JSONArray addJArray = JSONArray.parseArray(JSON.toJSONString(addModels));
        String filter = getClassName(addModels.get(0).getClass());

        /**
         * For storing files, additional json operations are required.
         *
         * If the map don't have the filter key, it needs add the key.
         * If the key exists, add to the original JSONArray.
         */
        if (!jo.containsKey(filter)) {
            jo.put(filter,addJArray);
        } else {
            for (Object one : addJArray) {
                ((JSONArray) jo.get(filter)).add(one);
            }
        }

        tmp = JSON.toJSONString(jo);

        saveContent(tmp);
    }

    /**
     * This function to read the JSON string from the file
     *
     * @return resultString String
     * @throws IOException
     */
    private static String readContent() throws IOException {
        File loadFile = BaseConnection.connect();
        // If first run the app, creating the file to save data.
        if (!loadFile.exists()) {
            loadFile.createNewFile();
        }

        FileReader fileReader = new FileReader(loadFile);
        Reader reader = new InputStreamReader(new FileInputStream(loadFile), "utf-8");

        int ch = 0;
        StringBuilder sb = new StringBuilder();
        while ((ch = reader.read()) != -1) {
            sb.append((char) ch);
        }

        fileReader.close();
        reader.close();
        String resultString = sb.toString();

        return resultString;
    }

    /**
     * This function is to write JSON string to the file.
     *
     * @param content String
     * @throws IOException
     */
    private static void saveContent(String content) throws IOException {
        File saveFile = BaseConnection.connect();

        if (saveFile.exists()) {
            saveFile.delete();
        }

        saveFile.createNewFile();
        Writer writer = new OutputStreamWriter(new FileOutputStream(saveFile), "UTF-8");
        writer.write(content);
        writer.flush();
        writer.close();
    }

    private static String getClassName(Class clazz) {
        /**
         *  Old jdk may not support this getPackageName(),
         *  it can be replaced by getName()
         */
        int beginIdx = clazz.getPackageName().length() + 1;
        int endIdx = clazz.getTypeName().length();
        String filter = clazz.getTypeName().substring(beginIdx, endIdx);

        return filter;
    }
}
