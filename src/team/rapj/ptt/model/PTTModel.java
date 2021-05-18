package team.rapj.ptt.model;

import team.rapj.ptt.console.APPConsole;
import team.rapj.ptt.dao.DataImpl;
import java.util.Scanner;

public class PTTModel {
    private String name;
    private int teacherID;
    
    public String getID() {
        return teacherID;
    }

    public String getname() {
        return name;
    }

    public static void input() throws Exception {

        Scanner scanner1 = new Scanner(System.in);
        String t = scanner1.next();
        String[] input = t.split(",");
        this.name = input [0];
        this.teacherID = Integer.parseInt (input [1]);
    }

    public static void output(){

        System.out.print(input [0] + " " + input [1] );

    }
}
