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
        writeLine("# A.      Input Course Requirement");
        writeLine("# B.      Input Part-time teachers Training");
        writeLine("# C.      Input Part-time teachers' Information");
        writeLine("# D.      View Course Requirements");
        writeLine("# F       View Training List");
        writeLine("# G       View Information List");
        writeLine("# E.      EXIT");
        writeLine("Please input A, B, C, D, F or E");
    }

    public static void main(String[] args) {
        APPConsole.welcome();
    }
}
