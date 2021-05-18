

import team.rapj.ptt.console.APPConsole;
import team.rapj.ptt.dao.DataImpl;
import java.util.Scanner;

public class PTTModel {
    private String name;
    private int teacherID;

    PTTModel(String n, int id) {
        this.name = n;
        this.teacherID = id;
    }
    
    public int getID() {
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
        int teacherID = Integer.parseInt (input[1]);

        PTTModel ptt = new PTTModel(name, teacherID);
        return ptt;  
    }

    public void output(){ System.out.print(name + " " + teacherID); }
}
