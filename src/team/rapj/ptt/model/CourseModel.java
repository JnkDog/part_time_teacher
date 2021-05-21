import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import team.rapj.ptt.dao.DataImpl;

public class CourseModel extends AbstractModel<CourseModel>{
    private String courseName;
    private List<RequirementModel> reqList;

    public CourseModel () {
        
    }

    public CourseModel (String n, List<RequirementModel> reqlist) {
        this.courseName = n;
        this.reqList = new ArrayList<>();
        for (RequirementModel a : reqlist) {
            reqList.add(a);
        }
    }

    public String getName() {
        return courseName;
    }

    public void setName(String name) {
        this.courseName = name;
    }

    public List<RequirementModel> getList() {
        return reqList;
    }

    public void setList(List<RequirementModel> list) {
        this.reqList = list;
    }

    public void print() {
        System.out.println("CourseName: " + getName());
        System.out.println("Now we have these requirement: ");
        for (RequirementModel m : this.getList()) {
            m.print();
        }
    }

    @Override
    public CourseModel stringToModel(String[] userInputArray) {
        String[] input = Arrays.copyOfRange(userInputArray, 1, userInputArray.length);
        RequirementModel a = new RequirementModel();
        a.stringToModel(input);
        List<RequirementModel> list = new ArrayList<>();
        list.add(a);
        CourseModel model = new CourseModel(userInputArray[0], list);
        return model;
    }

    @Override
    public void saveData(String[] userInputArray) throws Exception {
        CourseModel model = stringToModel(userInputArray);
        List<CourseModel> list = new ArrayList<>();
        list.add(model);
        DataImpl.saveData(list);
    }
}
