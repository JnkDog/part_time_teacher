package team.rapj.ptt.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import team.rapj.ptt.dao.DataImpl;

/**
 * @author
 */
public class CourseModel extends AbstractModel<CourseModel> {
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

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public List<RequirementModel> getRequirementList() {
        return reqList;
    }

    public void setRequirementList(List<RequirementModel> list) {
        this.reqList = list;
    }

    public void print() {
        System.out.println("CourseName: " + getCourseName());
        System.out.println("Now we have these requirement: ");
        for (RequirementModel m : this.getRequirementList()) {
            m.print();
        }
    }

    @Override
    public CourseModel stringToModel(String[] userInputArray) {
        String[] input = Arrays.copyOfRange(userInputArray, 1, userInputArray.length);
        RequirementModel a = new RequirementModel();
        a = a.stringToModel(input);
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

    public static void printCourse() throws Exception {
        CourseModel cModel = new CourseModel();
        List<CourseModel> cData = DataImpl.loadData(cModel.getClass());
        
        for (CourseModel c : cData) {
            c.print();
        }
    }
}
