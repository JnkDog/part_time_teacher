package team.rapj.ptt.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import team.rapj.ptt.console.APPConsole;
import team.rapj.ptt.dao.DataImpl;

public class PTTListModel {
    private int courseNum;
    private int listID;
    // private String teacherDemands;
    private int maxNum;

    private int teacherNum;
    // private int completeFlag;
    private List<PTTModel> teacherInfo;

    // 构造函数
    PTTListModel(int courseNum, int listID, int max) {
        this.courseNum = courseNum;
        this.listID = listID;
        this.maxNum = max;
        //this.completeFlag = 0;
        teacherInfo = new ArrayList<>();
    }

    // 调用函数
    public int getTeacherNum() {
        return teacherNum;
    }

    // public int getCompleteFlag() {
    //     return completeFlag;
    // }

    public void addPTT(PTTModel temp) {  
        if (teacherNum == maxNum) {
            APPConsole.writeLine("The list has been completed! Your operation is invalid!");
        } else {
           if (teacherInfo.contains(temp)) {
                APPConsole.writeLine("This teacher is already in the list!");
                // add overwrite to improve!
            } else {
                teacherInfo.add(temp);
                teacherNum++;
            } 
        }
        // if (teacherNum == maxNum) {
        //     completeFlag = 1;
        // }      
        
    }

    public void removePTT(PTTModel temp) {
            if (teacherInfo.contains(temp)) {
                teacherInfo.remove(temp);
                teacherNum--;
                // if (completeFlag == 1) {
                //     completeFlag = 0;
                // }
                if (teacherNum == 0) {
                    APPConsole.writeLine("The list is empty now!");
                }
            } else {
                APPConsole.writeLine("There is no such PTT!");
            }
    }
    
    public void showList() {
        System.out.println(courseNum);
        System.out.println(listID);
        for (PTTModel PTT : teacherInfo) {
            PTT.output();
        }
    }

    public static void input() throws Exception {
        APPConsole.writeLine("input course number, teacher Demands, listID, max number!");
        Scanner s = new Scanner(System.in);
        String t = s.next();
        String[] input = t.split(",");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);

        PTTListModel m = new PTTListModel(a, b, c);
        
        APPConsole.writeLine("input teacher name, ID!");
        while (m.teacherNum < m.maxNum) {
            // 判断是否结束输入跳出循环
            
            PTTModel temp = PTTModel.input();
            m.addPTT(temp);
        }
        List<PTTListModel> list = new ArrayList<>();
        list.add(m);
        DataImpl.saveData(list);
        APPConsole.writeLine("YEAH!");
    }
    public static void main(String[] args) {
        // rename
    }

}
