import java.util.Scanner;

public class FindMaximum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers will you enter? ");
        int count = input.nextInt();

        int[] data = new int[count];

        for (int idx = 0; idx < count; idx++) {
            System.out.print("Value at position " + idx + ": ");
            data[idx] = input.nextInt();
        }

        int largest = data[0];
        int position = 0;
        int pointer = 1;

        while (pointer < data.length) {
            if (data[pointer] > largest) {
                largest = data[pointer];
                position = pointer;
            }
            pointer++;
        }

        System.out.println();
        System.out.println("==============================");
        System.out.println("Numbers entered: " + java.util.Arrays.toString(data));
        System.out.println("Largest number is " + largest + ", located at position " + position + ".");
        System.out.println("==============================");

        input.close();
    }
}
