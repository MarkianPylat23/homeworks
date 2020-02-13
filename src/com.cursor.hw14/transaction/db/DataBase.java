package com.cursor.hw14.transaction.db;

import java.util.HashMap;
import java.util.Map;

public class DataBase {
    private static DataBase instance;
    private static Map<Integer, String> dataBase = new HashMap<>();

    private DataBase(Map<Integer, String> dataBase) {
        DataBase.dataBase = dataBase;
    }

    public static DataBase getServer() {
        if (instance == null) {
            return instance = new DataBase(DataBase.dataBase);
        }
        return instance;
    }

    public void addData(Integer key, String value) {
        dataBase.put(key, value);
    }

    public void getData(Integer key) {
        System.out.println(dataBase.get(key));
    }

    public void getExceptions() {
        try {
            Thread.sleep(350);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
