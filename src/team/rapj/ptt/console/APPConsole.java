package team.rapj.ptt.console;

/**
 * Singleton model. Make sure that one app has one console.
 *
 * @author Kuihong Chen
 */
public class APPConsole {
    private static APPConsole appConsole = new APPConsole();

    public static void writeLine(String str) {
        System.out.println(str);
    }

    public static void readLine(String str) {

    }

    public static void welcome() {
        writeLine("************************************************\n" +
                "*************     PTT SYSTEM       *************\n"
                );

        hint();
    }

    public static void hint() {
        writeLine("# A.      View Course Requirement");
        writeLine("# B.      View Part-time teachers Training");
        writeLine("# E.      EXIT");
        writeLine("Please input A, B or E");
    }

    public static void main(String[] args) {
        APPConsole.welcome();
    }
}
