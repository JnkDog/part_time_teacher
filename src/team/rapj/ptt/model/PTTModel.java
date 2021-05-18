package team.rapj.ptt.model;


import team.rapj.ptt.console.APPConsole;
import team.rapj.ptt.dao.DataImpl;

import java.util.List;
import java.util.Scanner;

public class PTTModel {
    private String name;
    private String teacherID;
    private List<String> trainingList;

    PTTModel(String n, String id) {
        this.name = n;
        this.teacherID = id;
    }
    
    public String getID() {
        return teacherID;
    }

    public String getname() {
        return name;
    }

    public static PTTModel input() throws Exception {
        Scanner scanner1 = new Scanner(System.in);
        String t = scanner1.next();
        String[] input = t.split(",");
        String name = input [0];
        String teacherID = input[1];

        PTTModel ptt = new PTTModel(name, teacherID);
        return ptt;  
    }

    public void output(){ System.out.print(name + " " + teacherID); }
}
