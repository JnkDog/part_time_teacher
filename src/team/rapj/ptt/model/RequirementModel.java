package team.rapj.ptt.model;

import team.rapj.ptt.dao.DataImpl;

import java.util.ArrayList;
import java.util.List;

public class RequirementModel extends AbstractModel<RequirementModel> {
    private String req;
    private int num;

    public RequirementModel() {

    }

    public RequirementModel(int a, String b) {
        num = a;
        req = b;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setReq(String req) {
        this.req = req;
    }

    public int getNum() {
        return num;
    }

    public String getReq() {
        return req;
    }

    public void print() {
        System.out.println("Need"+getNum()+"teachers.");
        System.out.println("Requirement:"+getReq());
    }




    public static void input() throws Exception {
//        APPConsole.writeLine("Input Format: Num, Requirement");
//        Scanner scanner1 = new Scanner(System.in);
//        String t = scanner1.next();
//        String[] input = t.split(",");
//        int a = Integer.parseInt(input[0]);
//        RequirementModel req = new RequirementModel(a,input[1]);
//        List<RequirementModel> list = new ArrayList<>();
//        list.add(req);
//        DataImpl.saveData(list);
    }

    @Override
    public RequirementModel stringToModel(String[] userInputArray) {
        int num = Integer.parseInt(userInputArray[0]);
        RequirementModel req = new RequirementModel(num, userInputArray[1]);

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
