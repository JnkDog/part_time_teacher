import java.util.Scanner;

import team.rapj.ptt.console.APPConsole;
import team.rapj.ptt.model.*;

/**
 * Main function
 *
 * @author Teams
 */
public class Main {
    public static void main(String[] args) throws Exception {
        APPConsole.welcome();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            APPConsole.writeLine("Your command");
            String opt = scanner.next().toUpperCase();
            switch (opt) {
                case "A":
                    // get Course requirement info
                    // RequirementModel.input();
                    APPConsole.writeLine("Input Format: Teacher Number, Requirement");
                    String[] userInputArray = APPConsole.splitUserInput();
                    AbstractModel model = new RequirementModel();
                    model.saveData(userInputArray);

                    break;
                case "B":
                    // input CourseModel
                    APPConsole.writeLine("Input Format: CourseName, Teacher Number, Requirement");
                    String[] userInputC = APPConsole.splitUserInput();
                    AbstractModel modelC = new CourseModel();
                    modelC.saveData(userInputC);
                    
                    break;
                case "C":
                    APPConsole.writeLine("Input Format: Name, Teacher's ID, Training List");
                    String[] userInputArr = APPConsole.splitUserInput();
                    AbstractModel modelPTT = new PTTModel();
                    modelPTT.saveData(userInputArr);

                    break;
                case "D":
                    APPConsole.writeLine("# Loading requirement data...");
                    RequirementModel.printData();
                    APPConsole.writeLine("# Load over ......");

                    break;
                case "F":
                // read Course Data
                    APPConsole.writeLine("# loading course data...");
                    CourseModel.printCourse();
                    APPConsole.writeLine("# Load over ......");

                    break;
                case "G":
                    // read Teacher List
                    APPConsole.writeLine("# loading teacher data...");
                    PTTModel.printPTTinfo();
                    APPConsole.writeLine("# Load over ......");

                    break;
                case "E":
                    // TBD test
                    APPConsole.writeLine("**************     Bye Bye       **************");
                    return;
                default:
                    APPConsole.hint();
            }
        }
    }
}
