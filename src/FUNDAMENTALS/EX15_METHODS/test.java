package FUNDAMENTALS.EX15_METHODS;

public class test {
    public static void main(String[] args) {


        int[] array = {2, 2, 2, 1, 1, 1};
        int count = 2;

        System.out.println("test\n");

        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            if (i == array.length - 1) {
                System.out.println(element + "]");
                break;
            }
            System.out.print(element + ", ");
        }

        
    }
}
