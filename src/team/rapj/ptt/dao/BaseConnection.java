package team.rapj.ptt.dao;

import java.io.File;

/**
 * Open the file to save or load data
 *
 * @author Kuihong Chen
 */
public class BaseConnection {
//    private static String SAVE_PATH = "./";
    private static String FILE_NAME = "cpytest.json";

    public static File connect() {
        File file = new File(FILE_NAME);

        return file;
    }
}
