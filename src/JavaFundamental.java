import java.awt.*;
import java.sql.SQLOutput;
import java.util.*;

public class JavaFundamental {
    final Random random = new Random();
    final Scanner in = new Scanner(System.in);

    public JavaFundamental inputName(){
        System.out.print("Input your name: ");
        String name= in.next();
        System.out.println("Your name is: " + name);
        in.close();
        return this;
    }

    public JavaFundamental showRandomNumbers() {
        ArrayList arrayList = new ArrayList();
        int minimumNumber = 1;
        int maximimNumber = 10;
        for (int i = 0;i<10;i++){
            int randomNumber = minimumNumber + random.nextInt(10)*(maximimNumber - minimumNumber + 1);
            arrayList.add(randomNumber);
            System.out.println(arrayList.toString());
        }
        return this;
    }

    public JavaFundamental countOfConseleNembers(){
        System.out.println("Input two numbers: ");
        int firstNumber = in.nextInt();
        int secondNumber = in.nextInt();
        int sum = firstNumber + secondNumber;
        int multiplication = firstNumber * secondNumber;
        System.out.println("Sum of two numbers: " + sum);
        System.out.println("Multiplication of two numbers: " + multiplication);
        return this;
    }

    public JavaFundamental showMonth(){
        Map<Integer, String> calendar = new HashMap<Integer, String>();
        calendar.put(1,"January");
        calendar.put(2,"February");
        calendar.put(3,"March");
        calendar.put(4,"April");
        calendar.put(5,"May");
        calendar.put(6,"June");
        calendar.put(7,"July");
        calendar.put(8,"August");
        calendar.put(9,"September");
        calendar.put(10,"October");
        calendar.put(11,"November");
        calendar.put(12,"December");
        int randomMonth = random.nextInt(12)+(1);
        System.out.println(randomMonth);
        String month = calendar.get(randomMonth);
        System.out.println(month);
        return this;
    }

    public JavaFundamental consoleCounter(){
        System.out.print("Input n numbers: ");
        int arraySize = in.nextInt();
        int[] arrayOfNNumbers = new int[arraySize];
        for (int i = 0; i < arrayOfNNumbers.length; i++){
            arrayOfNNumbers[i] = in.nextInt();
        }
        Arrays.sort(arrayOfNNumbers);
        for (int i = 0; i < arrayOfNNumbers.length; i++) {
            System.out.println(arrayOfNNumbers[i] + " ");
        }
        boolean isSorted = false;
        int buffer;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < arrayOfNNumbers.length-1; i++) {
                if(arrayOfNNumbers[i] < arrayOfNNumbers[i+1]){
                    isSorted = false;
                    buffer = arrayOfNNumbers[i];
                    arrayOfNNumbers[i] = arrayOfNNumbers[i+1];
                    arrayOfNNumbers[i+1] = buffer;
                }
            }
        }
        for (int i = 0; i < arrayOfNNumbers.length; i++) {
            System.out.println(arrayOfNNumbers[i] + " ");
        }
        return this;
    }

    public JavaFundamental intCounter(){
        System.out.print("Input n numbers: ");
        int arraySize = in.nextInt();
        int allDigitsCount = 0;
        double averageLength = 0;
        int[] arrayOfCountsOfDigits = new int[arraySize];
        int[] arrayOfNNumbers = new int[arraySize];
        for (int i = 0; i < arrayOfNNumbers.length; i++){
            arrayOfNNumbers[i] = in.nextInt();
        }

        for (int i = 0; i < arrayOfNNumbers.length; i++){
            System.out.println(arrayOfNNumbers[i] + " contains " + getCountsOfDigits(arrayOfNNumbers[i])+ " numbers");
            arrayOfCountsOfDigits[i] = getCountsOfDigits(arrayOfNNumbers[i]);
            allDigitsCount += arrayOfCountsOfDigits[i];
        }
        averageLength = (double)allDigitsCount/arraySize;
        System.out.println("allDigitsCount: " + allDigitsCount);
        System.out.println(averageLength);

        for (int i = 0; i < arrayOfNNumbers.length; i++){
            if (arrayOfCountsOfDigits[i] < averageLength)
                System.out.println(arrayOfNNumbers[i] + " length of numbers less than average length " + arrayOfCountsOfDigits[i]);
            if (arrayOfCountsOfDigits[i] >= averageLength)
                System.out.println(arrayOfNNumbers[i] + " length of numbers more than average length " + arrayOfCountsOfDigits[i]);
        }

        Arrays.sort(arrayOfNNumbers);
        System.out.println("Ascending numbers");
        for (int i = 0; i < arrayOfNNumbers.length; i++) {
            System.out.println(arrayOfNNumbers[i] + " ");
        }
        System.out.println("Descending numbers");
        boolean isSorted = false;
        int buffer;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < arrayOfNNumbers.length-1; i++) {
                if(arrayOfNNumbers[i] < arrayOfNNumbers[i+1]){
                    isSorted = false;
                    buffer = arrayOfNNumbers[i];
                    arrayOfNNumbers[i] = arrayOfNNumbers[i+1];
                    arrayOfNNumbers[i+1] = buffer;
                }
            }
        }
        for (int i = 0; i < arrayOfNNumbers.length; i++) {
            System.out.println(arrayOfNNumbers[i] + " ");
        }
        return this;
    }

    public int getCountsOfDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    public JavaFundamental matrix(){
        System.out.print("Input n numbers: ");
        int n = in.nextInt();
        int matrix[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        return this;
    }


    public static void main(String[] args) {
        JavaFundamental fundamental = new JavaFundamental();
//        fundamental.inputName();
//        fundamental.showRandomNumbers();
//        fundamental.countOfConseleNembers();
//        fundamental.showMonth();
//        fundamental.consoleCounter();
//        fundamental.intCounter();
        fundamental.matrix();
    }
}
