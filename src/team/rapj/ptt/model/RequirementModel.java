package team.rapj.ptt.model;

import team.rapj.ptt.dao.DataImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RequirementModel extends AbstractModel<RequirementModel> {
    private String[] requirements;
    private int number;

    public RequirementModel() {
    }

    public RequirementModel(int a, String[] b) {
        number = a;
        requirements = b;
    }

    public int getNumber() {
        return number;
    }

    public String[] getRequirements() {
        return requirements;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setRequirements(String[] requirements) {
        this.requirements = requirements;
    }

    public void print() {
        System.out.println("Need " + getNumber() + " teachers.");
        System.out.println("Requirements: " + getRequirements().toString());
    }

    @Override
    public RequirementModel stringToModel(String[] userInputArray) {
        int number = Integer.parseInt(userInputArray[0].strip());
        String[] requirements = Arrays.copyOfRange(userInputArray, 1, userInputArray.length);
        RequirementModel req = new RequirementModel(number, requirements);

        return req;
    }

    @Override
    public void saveData(String[] userInputArray) throws Exception {
        RequirementModel model = stringToModel(userInputArray);
        List<RequirementModel> list = new ArrayList<>();
        list.add(model);
        DataImpl.saveData(list);
    }

    public void printData() throws Exception {
        System.out.println("Loading Data:");
        RequirementModel reqClass = new RequirementModel();
        List<RequirementModel> reqData = DataImpl.loadData(reqClass.getClass());
        for (int i = 0;i<reqData.size();i++) {
            reqData.get(i).print();
        }
        System.out.println("Finished");
    }


}
