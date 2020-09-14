package ru.sbrf.lessons.lesson_3;

public class Main {
    public static void main(String[] args) {
        System.out.println(sum((byte) 5, (short) 7));
        System.out.println(multiplication(5, 7));
        System.out.println(getMaxNumber(5, 7));
        System.out.println(isCharA('A'));
        System.out.println(isCharNumber('1'));
        binaryZeroToThirty();
        binaryMaxValue();
        System.out.println(charToInt('1'));
        System.out.println(intToChar(5));
    }

    public static byte sum(byte a, short b) {
        return (byte) (a + b);
    }

    public static int multiplication(int a, long b) {
        return (int) (a * b);
    }

    public static int getMaxNumber(int a, int b) {
        return Math.max(a, b);
    }

    public static boolean isCharA(char a) {
        return a == 'A';
    }

    public static boolean isCharNumber(char a) {
        return Character.isDigit(a);
    }

    public static void binaryZeroToThirty() {
        for (int a = 0; a < 30; a++) {
            System.out.println(Integer.toBinaryString(a));
        }
    }

    public static void binaryMaxValue() {
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE + 1));
    }

    public static char charToInt(char a) {
        return a;
    }

    public static int intToChar(int a) {
        return (char) a;
    }
}
