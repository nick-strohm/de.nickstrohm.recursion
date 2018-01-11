package de.nickstrohm.recursion;

public class Main {

    public static void main(String[] args) {
        System.out.println(a(20));
        System.out.println(recursionStart(20));
    }

    public static int a(int n) {
        if (n >= 2) {
            return 5 + a(n - 1);
        }

        return 2;
    }

    public static String recursionStart(int x) {
        return methodA(x, "");
    }

    private static String methodA(int x, String s) {
        if (x <= 0) {
            return "";
        }

        return "a" + methodB(x - 1, s);
    }

    private static String methodB(int x, String s) {
        if (x <= 0) {
            return "";
        }

        return methodA(x - 1, s) + "b";
    }
}
