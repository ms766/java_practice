import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int[] getInts(int size){
        Scanner scanner = new Scanner(System.in);
        int[] list = new int[size];
         for(int i = 0;i<list.length;i++){
             System.out.print("Enter array values:");
             list[i] = scanner.nextInt();
         }
         return list;
    }

    public static void printArray(int[] inArray){
        System.out.println();
        for(int i = 0;i < inArray.length;i++){
            System.out.println("index:"+i+"="+inArray[i]+" ");
        }
    }

    public static int[] arraySorter(int[] inArray){
        int[] sortedArray = new int[inArray.length];
        for(int i = 0;i < inArray.length;i++){
            sortedArray[i] = inArray[i];
        }
        boolean flag = true;
        int temp;
        while (flag){
            flag = false;
            for(int i=0;i<sortedArray.length-1;i++)
                if(sortedArray[i]<sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
        }
        return sortedArray;
    }

    public static void reverse(int[] numberArray){
        int updatedArray[] = new int[numberArray.length];
        for(int i = 0;i<numberArray.length;i++){
            updatedArray[i] = numberArray[numberArray.length-1-i];
        }
        System.out.println(Arrays.toString(updatedArray));
    }

    public static int[] reSeize(int[] inArray,int newSize){
        int[] updatedArray = new int[newSize];
        for(int i = 0; i < inArray.length;i++){
                updatedArray[i] = inArray[i];
        }
        return updatedArray;
    }

    public static void main(String[] args) {
        //printArray(arraySorter((getInts(3))));
        int[] x = {5,4,3,2,1};
        System.out.println(Arrays.toString(  reSeize(x,8)));

    }


}