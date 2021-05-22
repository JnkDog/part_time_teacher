package team.rapj.ptt.model;

import team.rapj.ptt.dao.DataImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * @author
 */
public class PTTModel extends AbstractModel<PTTModel>{
    private String name;
    private String teacherID;
    private List<String> trainingList;

    public PTTModel() {
    }

    public PTTModel(String n, String id, List trainingList) {
        this.name = n;
        this.teacherID = id;
        this.trainingList = trainingList;
    }
    
    public String getTeacherID() {
        return teacherID;
    }

    public String getName() {
        return name;
    }

    public List<String> getTrainingList() {
        return trainingList;
    }

    public void setTeacherID(String id) {
        this.teacherID = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setList(List<String> trainingList) {
        this.trainingList = trainingList;
    }

//    public static PTTModel input() throws Exception {
//        Scanner scanner1 = new Scanner(System.in);
//        String t = scanner1.next();
//        String[] input = t.split(",");
//        String name = input [0];
//        String teacherID = input[1];
//
//        PTTModel ptt = new PTTModel(name, teacherID);
//        return ptt;
//    }

    public void print(){
        System.out.println(name + " " + teacherID);
        for (int j = 0; j < trainingList.size(); j++) {
            System.out.println(trainingList.get(j));
        }

    }

    @Override
    public void saveData(String[] userInputArray) throws Exception {
        PTTModel model = stringToModel(userInputArray);
        List<PTTModel> list = new ArrayList<>();
        list.add(model);
        DataImpl.saveData(list);
    }

    public static void printPTTinfo() throws Exception {
        PTTModel pModel = new PTTModel();
        List<CourseModel> pData = DataImpl.loadData(pData.getClass());

        for (PTTModel p : pData) {
            p.print();
        }
    }

    @Override
    public PTTModel stringToModel(String[] userInputArray) {
        String num = userInputArray[0];
        String id = userInputArray[1];
        List<String> trainingList = new ArrayList<>();

        for (int i = 2; i < userInputArray.length; i++) {
            trainingList.add(userInputArray[i]);
        }

        PTTModel req = new PTTModel(num, id, trainingList);
        return req;
    }
}
