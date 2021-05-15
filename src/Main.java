import team.rapj.ptt.console.APPConsole;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        APPConsole.welcome();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            APPConsole.writeLine("Your input");
            String opt = scanner.next().toUpperCase();
            switch (opt) {
                case "A":
                    // get Course requirement info
                    break;
                case "B":
                    // get training info
                    break;
                case "I":
                    // TrainingModel.add()
                    // Training....
                    // input 一行输入 然后 save一行
                    // Model string to model
                    // interface
                    // Model --> save()
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
