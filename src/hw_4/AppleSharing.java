package hw_4;

public class AppleSharing {
    public static void main(String[] args) {
        printExpression(40, 6);
        printExpression(100, 21);
        printExpression(42, 42);
        printExpression(55, 5);
        printExpression(1, 2);
        printExpression(120,12);
    }

    public static void printExpression(int apples, int students) {
        int applesPerStudent = apples / students;
        int remainingApples = apples % students;
        System.out.println(String.format(
                "Если %d %s поделить на %d %s, то каждый ученик получит по %d %s, и %d %s останется учителю.",
                apples, getAppleDeclension(apples), students, getStudentDeclension(students),
                applesPerStudent, getAppleDeclension(applesPerStudent), remainingApples, getAppleDeclension(remainingApples)
        ));
    }

    public static String getAppleDeclension(int number) {
        if (number % 10 == 1 && number % 100 != 11) {
            return "яблоко";
        } else if ((number % 10 >= 2 && number % 10 <= 4) && (number % 100 < 10 || number % 100 >= 20)) {
            return "яблока";
        } else {
            return "яблок";
        }
    }

    public static String getStudentDeclension(int number) {
        if (number % 10 == 1 && number % 100 != 11) {
            return "ученик";
        } else if ((number % 10 >= 2 && number % 10 <= 4) && (number % 100 < 10 || number % 100 >= 20)) {
            return "ученика";
        } else {
            return "учеников";
        }
    }
}