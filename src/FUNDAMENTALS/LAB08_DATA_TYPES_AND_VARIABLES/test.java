package FUNDAMENTALS.LAB08_DATA_TYPES_AND_VARIABLES;

public class test {
    public static void main(String[] args) {


//        int a = Integer.MAX_VALUE;
//        System.out.println(a);
//        System.out.println(a + 5);

        byte n = 127;
        System.out.println(n + 1);
        System.out.println((byte)(n + 1));


        // char, byte, short
        byte a = 10;
        byte b = 7;
        byte c = (byte) (a + b);

        // byte c = (int) a + (int) b
        System.out.println(a + b);

    }
}
