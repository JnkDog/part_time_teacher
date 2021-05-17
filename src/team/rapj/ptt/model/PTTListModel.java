package src.team.rapj.ptt.model;
import java.io.Console;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PTTListModel {
    private int courseNum;
    private int listID;
    private String teacherDemands;
    private int maxNum;

    private int teacherNum;
    private int completeFlag;
    private List<PTTModel> teacherInfo;

    // 构造函数
    PTTListModel(int courseNum, String teacherDemands, int listID, int max) {
        this.courseNum = courseNum;
        this.teacherDemands = teacherDemands;
        this.listID = listID;
        this.maxNum = max;
        //this.completeFlag = 0;
        teacherInfo = new ArrayList();
    }

    // 调用函数
    public int getTeacherNum() {
        return teacherNum;
    }

    // public int getCompleteFlag() {
    //     return completeFlag;
    // }

    public void addPTT() {  
        if (teacherNum == maxNum) {
            APPConsole.writeLine("The list has been completed! Your operation is invalid!");
        }

        while (teacherNum < maxNum && input == 'Y') {
            // input info
            PTTModel temp = new PTTModel.input();
            // judge
            if (teacherInfor.isconstrain(temp)) {
                    APPConsole.writeLine("This teacher is already in the list!");
                    // add overwrite to improve!
            } else {
                teacherInfo.add(temp);
                teacherNum++;
            }
            // if (teacherNum == maxNum) {
            //     completeFlag = 1;
            // }      
        }
    }

    public void removePTT() {
        while (teacherNum > 0) {
            PTTModel temp = new PTTModel.input();
            if (teacherInfo.isconstrain(temp)) {
                teacherInfo.remove(temp);
                teacherNum--;
                // if (completeFlag == 1) {
                //     completeFlag = 0;
                // }
                if (teacherNum == 0) {
                    APPConsole.writeLine("The list is empty now!");
                    break;
                }
            } else {
                APPConsole.writeLine("There is no such PTT!");
            }
        }
    }
    
    public void showList() {
        APPConsole.writeLine(courseNum);
        APPConsole.writeLine(listID);
        APPConsole.writeLine(teacherDemands);
        for (PTTModel PTT : teacherInfo) {
            PTT.output();
        }
    }

    public static void main(String[] args) {
        // rename
    }

}
