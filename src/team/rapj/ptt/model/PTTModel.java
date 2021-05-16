package src.team.rapj.ptt.model;
import java.util.Date;

public class PTTModel {
    private String name;
    private Date dateInfo; // 调用博哥时间结构
    private String teacherID;
    
    public String getID() {
        return teacherID;
    }

    public String getname() {
        return name;
    }

}
