import java.util.Scanner;

public class ArraysExamples1 {

    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

//        int[] myArray;
//        myArray = new int[10];

        int[] intArray = new int[3];

        intArray[0] = 3;
        intArray[1] = 2;
        intArray[2] = 1;
        System.out.println(intArray[1]);

        int[] intArray2 = {9,8,7};
        System.out.println(intArray2[1]);

        for(int i = 0; i<3;i++){
            System.out.println(intArray2[i]);
        }

        //length method for arrays
        for(int j = 0; j < intArray2.length;j++){
            System.out.println(intArray2[j]);
        }

        printArray(intArray2);

        int[] myIntegers = getIntegers(5);
        for(int i = 0; i<myIntegers.length;i++){
            System.out.println("Element "+ i+", typed value was "+ myIntegers[i]);
        }
    }



    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }

    public static int[] getIntegers(int number){
        System.out.println("Enter "+ number + " integer value.\r");
        int[] values = new int[number];
        for(int i = 0; i < values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length;i++){
            sum += array[i];
        }
        return ((double) sum /(double)array.length);
    }
}
