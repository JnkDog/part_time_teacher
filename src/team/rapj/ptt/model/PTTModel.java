package team.rapj.ptt.model;


import team.rapj.ptt.console.APPConsole;
import team.rapj.ptt.dao.DataImpl;
import java.util.ArrayList;
import java.util.List;


public class PTTModel extends AbstractModel<PTTModel> {
    private String name;
    private String teacherID;
    private List<String> trainingList;

    PTTModel(String n, String id, List trainingList) {
        this.name = n;
        this.teacherID = id;
        this.trainingList = new ArrayList<>();
        this.trainingList = trainingList;
    }
    
    public String getID() {
        return teacherID;
    }

    public String getname() {
        return name;
    }

    public static PTTModel stringToModel(String[] userInputArray) {
        List<String> list = new ArrayList<>();
        for (int i = 2; i < userInputArray.length(); i++) {
            list.add(userInputArray[i]);
        }
        PTTModel ptt = new PTTModel(userInputArray[0], userInputArray[1], list );
        return ptt;  
    }


    public void output(){
        System.out.println(userInputArray[0] + " " + userInputArray[1]);
        for (int j = 0; j < list.size(); j++) {
            System.out.println(list.get(j));
        }

    }
}
