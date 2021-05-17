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
        this.completeFlag = 0;
        teacherInfo = new ArrayList();
    }

    // 调用函数
    public int getTeacherNum() {
        return teacherNum;
    }

    public int getCompleteFlag() {
        return completeFlag;
    }

    public void addPTT() {  
        if (completeFlag == 0 ) {
            if (teacherInfor.isconstrain(PTT)) {
                APPConsole.writeLine("This teacher is already in the list!");
                // add overwrite to improve!
            } else {
                // input info
                // 调用你的ptt的输入
                
                teacherInfo.add(PTT);
                teacherNum++;
            }
            if (teacherNum == maxNum) {
                completeFlag = 1;
            } 
        } else {
            APPConsole.writeLine("The list has been completed! Your operation is invalid!");
        }
    }

    public void removePTT() {
        if (teacherInfo.isconstrain(PTT)) {
            teacherInfo.remove(PTT);
            teacherNum--;
            if (completeFlag == 1) {
                completeFlag = 0;
            }
            if (teacherNum == 0) {
                APPConsole.writeLine("The list is empty now!");
            }
        } else {
            APPConsole.writeLine("There is no such PTT!");
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
