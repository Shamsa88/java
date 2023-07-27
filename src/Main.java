import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String[] Words = {"hello", "in", "our", "new", "world"};
        String space = " ";
        String row = "";
        String star = "*";
        String firstRow = "";
        int maxlength = Words[0].length();
        for (int i = 0; i < Words.length; i++) {
            if (Words[i].length() > maxlength) {
                maxlength = Words[i].length();
            }
        }
        firstRow = star.repeat(maxlength + 2);
        System.out.println(firstRow);
        for (int i = 0; i < Words.length; i++) {
            row = "*" + Words[i];
            row = row + space.repeat(maxlength - Words[i].length());
            row = row + "*";
            System.out.println(row);
        }
        System.out.println(firstRow);
        

    }
}
