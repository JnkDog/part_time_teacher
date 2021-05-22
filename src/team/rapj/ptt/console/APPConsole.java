package team.rapj.ptt.console;

import java.util.Scanner;

/**
 * Printing message to console.
 *
 * @author Kuihong Chen
 */
public class APPConsole {
    public static void writeLine(String str) {
        System.out.println(str);
    }

    public static String readLine() {
        Scanner scanner = new Scanner(System.in);
        String readLine = scanner.nextLine();

        return readLine;
    }

    public static String[] splitUserInput() {
        String tmp = readLine();
        String[] stringArray = tmp.split(",");

        return stringArray;
    }

    public static void welcome() {
        writeLine("************************************************\n" +
                "*************     PTT SYSTEM       *************\n"
                );

        hint();
    }

    public static void hint() {
        writeLine("#         Case-insensitive        #");
        writeLine("# A.      Input Training Requirement");
        writeLine("# B.      Input Course information");
        writeLine("# C.      Input Part-time teachers' Information");
        writeLine("# D.      View Training Requirements");
        writeLine("# F       View Course List");
        writeLine("# G       View Teacher List");
        writeLine("# E.      EXIT");
        writeLine("Please input A, B, C, D, F or E");
    }

    public static void main(String[] args) {
        APPConsole.welcome();
    }
}
