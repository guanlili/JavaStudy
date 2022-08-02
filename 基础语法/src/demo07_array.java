import java.util.Arrays;
import java.util.Date;

public class demo07_array {
    static int [] mylist={1,2,3,4};
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static int[] reverse(int[] list) {
        int[] result = new int[list.length];

        for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
            result[j] = list[i];
        }
        return result;
    }


    public static void main(String[] args) {
//        System.out.println(mylist[1]);
         int[] youlist =new int[3];
         youlist[0]=2;
         youlist[1]=3;
         youlist[2]=4;

//        System.out.println(youlist[1]);
        printArray(reverse(youlist));
        int a = Arrays.binarySearch(youlist, 2);

    }
}

