package team.rapj.ptt.model;

import team.rapj.ptt.console.APPConsole;
import team.rapj.ptt.dao.DataImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RequirementModel {
    private String req;
    private int num;

    public RequirementModel(int a, String b) {
        num = a;
        req = b;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setReq(String req) {
        this.req = req;
    }

    public int getNum() {
        return num;
    }

    public String getReq() {
        return req;
    }

    public void print() {
        System.out.println("Need"+getNum()+"teachers.");
        System.out.println("Requirement:"+getReq());
    }


    public static void input() throws Exception {
        APPConsole.writeLine("Input Format: Num, Requirement");
        Scanner scanner1 = new Scanner(System.in);
        String t = scanner1.next();
        String[] input = t.split(",");
        int a = Integer.parseInt(input[0]);
        RequirementModel req = new RequirementModel(a,input[1]);
        List<RequirementModel> list = new ArrayList<>();
        list.add(req);
        DataImpl.saveData(list);
    }
}
