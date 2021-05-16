package src.team.rapj.ptt.model;
import java.util.HashMap;
import java.util.Map;


public class PTTList {

    private int courseNum;
    private int listID;
    private String teacherDemands;
    private int maxNum;


    private int teacherNum;
    private int completeFlag;
    private Map<String, PTTModel> teacherInfo;

    // 构造函数
    PTTList(int courseNum, String teacherDemands, int listID, int max) {
        this.courseNum = courseNum;
        this.teacherDemands = teacherDemands;
        this.listID = listID;
        this.maxNum = max;
        this.completeFlag = 0;
        teacherInfo = new HashMap<String, PTTModel>();
    }

    // 调用函数
    public int getTeacherNum() {
        return teacherNum;
    }

    public int getCompleteFlag() {
        return completeFlag;
    }

    /**
     * teacherInfo add & remove
     * teacherNum ++,--
     * judge completeFlag
     * 检测teacherID == PTT.teacherID
     * 输入or直接读取:
     */
    public void addTeacher(String teacherID, PTTModel PTT) {  
        if (completeFlag == 0 && teacherID.equals(PTT.getID())) {
            /** if teacherInfo.contains(teacherID) {
             * 已有这个教师，请问是否要更新他的数据；
             * scanf (yes or no);
             * then...
             * }
             */
            teacherInfo.put(teacherID, PTT);
            teacherNum++;
            if (teacherNum == maxNum) {
                completeFlag = 1;
            } 
        } else {
            System.out.println("The list has been completed!");
        }
    }

    public void removeTeacher(String teacherID) {
        if (teacherNum > 0 && teacherInfo.containsKey(teacherID)) {
            teacherInfo.remove(teacherID);
            teacherNum--;
            if (completeFlag == 1) {
                completeFlag = 0;
            }
        }
    }
    
    public void showList() {
        System.out.println(courseNum);
        System.out.println(listID);
        System.out.println(teacherDemands);
        for (String teacherID : teacherInfo.keySet()) {
            String name = teacherInfo.get(teacherID).getname();
            System.out.println(teacherID + " = " + name);
        }
    }

    public static void main(String[] args) {
        // rename
    }

}
