import team.rapj.ptt.console.APPConsole;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        APPConsole.welcome();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            APPConsole.writeLine("Your command");
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
                    // console输入样式
                    // 不要都写在这一个操作符下面
                    // 自己另外case操作符号！！！
                    APPConsole.writeLine("Input Format");
                    // 这里的scanner是用来读用户输入数据的字符串，别和上面那个读操作的scanner搞混了
                    Scanner scanner1 = new Scanner(System.in);
                    // 读入的用户输入的数据，如果你想要hard一下，目测可以循环读取用户输入，然后字符串加下去
                    // 这样就实现了多行输入数据
                    String t = scanner1.next();
                    //  ---- 需要完成的工作  -----
                    // 根据读入的字符串转化成对应的model～，然后塞入我的保存api
                    // 如果无BUG 估计就好了

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
