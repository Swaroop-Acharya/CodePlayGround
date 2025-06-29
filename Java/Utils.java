import java.util.*;

public class Utils{

    public static void arrayInput(int[] arr, int n, Scanner in) {
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
    }

    public static void twoDArrayInput(int[][] arr, int rows, int cols, Scanner in) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = in.nextInt();
            }
        }
    }

    public static void printArray(int[] arr, int n) {
        System.out.println("Array Elements:");
        for (int ele : arr) System.out.print(ele + " ");
        System.out.println();
    }

    public static void swapArrayElems(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void print2DArr(int[][] arr, int rows, int cols) {
        System.out.println("2D Array Elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void reverseArr(int[] arr, int left, int right) {
        while (left < right) {
            int t = arr[left];
            arr[left] = arr[right];
            arr[right] = t;
            left++;
            right--;
        }
    }
}

