package team.rapj.ptt.dao;

import com.alibaba.fastjson.JSON;
import team.rapj.ptt.training.Training;
import team.rapj.ptt.training.TrainingDetail;

import java.io.*;
import java.nio.file.Files;
import java.util.Date;
import java.util.List;

class DataImpl extends BaseConnection implements OperationInDAO {

    // 需要什么样的格式
    @Override
    public List<Training> loadAllTraining() throws IOException {
        File loadFile = BaseConnection.connect();
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

        // need json parse

        return null;
    }

    @Override
    public void saveAllTraining() throws IOException {
        File saveFile = BaseConnection.connect();
        TrainingDetail td = new TrainingDetail(new Date(), "Room E", "test", "test value");
        String content = JSON.toJSONString(td);

        if (saveFile.exists()) {
            saveFile.delete();
        }

        saveFile.createNewFile();
        Writer writer = new OutputStreamWriter(new FileOutputStream(saveFile), "UTF-8");
        writer.write(content);
        writer.flush();
        writer.close();
    }

    public String test() throws Exception {
        File loadFile = BaseConnection.connect();
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

        // need json parse

        return resultString;
    }

    public static void main(String[] args) throws Exception {
        DataImpl d1 = new DataImpl();
        d1.saveAllTraining();
    }
}
