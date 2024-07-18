package hw_10;

import static helpers.Helper.task;
import static hw_10.Methods.*;

public class App {
    public static void main(String[] args) {
        task(1);
        System.out.println(spQA("    QA4Everyone  "));
        System.out.println(spQA("QA4Everyone"));
        System.out.println(spQA(""));

        task(2);
        System.out.println(RemoveAlla("    QA4Everyone   "));
        System.out.println(RemoveAlla("    panda   "));

        task(3);
       String x ;
        x = "  3 5 0 4 2 0 9 7 0 6 0 4 0       0 0 0 ";
        System.out.println(RemoveAllZeros(x));
        x = " 0000000111";
        System.out.println(RemoveAllZeros(x));

        task(4);

        x = "    QA   4  Everyone   ";
        System.out.println(RemoveAllZeros(x));
        x = "p a     n d a  ";
        System.out.println(RemoveAllZeros(x));
        System.out.println(x.toLowerCase().charAt(6));

        task(5);

        System.out.println(a("Abracadabra"));
        System.out.println(a("Homenum Revelio"));


        task(6);
        x= " As of March 2022, Java 18 is the latest version, " +
                "while Java 17, 11 and 8 are the current long-term support " +
                "(LTS) versions. Oracle released the last zero-cost public " +
                "update for the legacy version Java 8 LTS in January 2019 for " +
                "commercial use, although it will otherwise still support Java 8" +
                " with public updates for personal use indefinitely. Other vendors" +
                " have begun to offer zero-cost builds of OpenJDK 8 and 11 " +
                "that are still receiving security and other upgrades.";
        System.out.println(x.contains("Java"));

        x = "As a decrepit father takes delight\n" +
                "To see his active child do deeds of youth,\n" +
                "So I, made lame by fortune’s dearest spite,\n" +
                "Take all my comfort of thy worth and truth.\n" +
                "For whether beauty, birth, or wealth, or wit,\n" +
                "Or any of these all, or all, or more,\n" +
                "Entitled in thy parts do crownèd sit,\n" +
                "I make my love engrafted to this store.\n" +
                "So then I am not lame, poor, nor despised,\n" +
                "Whilst that this shadow doth such substance give\n" +
                "That I in thy abundance am sufficed,\n" +
                "And by a part of all thy glory live.\n" +
                "Look what is best, that best I wish in thee.\n" +
                "This wish I have; then ten times happy me";
        System.out.println(x.contains("Java"));

        task(7);
        System.out.println(quotes("  TWO  ","\"",".","\""));


    }
}
