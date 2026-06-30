import java.util.Scanner;

public class PairSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers are in your list? ");
        int total = input.nextInt();

        int[] list = new int[total];

        for (int idx = 0; idx < total; idx++) {
            System.out.print("Enter value #" + (idx + 1) + ": ");
            list[idx] = input.nextInt();
        }

        System.out.print("What sum are you trying to reach? ");
        int goal = input.nextInt();

        boolean matchFound = false;
        int firstIndex = -1;
        int secondIndex = -1;

        outerLoop:
        for (int a = 0; a < list.length; a++) {
            for (int b = a + 1; b < list.length; b++) {
                if (list[a] + list[b] == goal) {
                    firstIndex = a;
                    secondIndex = b;
                    matchFound = true;
                    break outerLoop;
                }
            }
        }

        System.out.println();
        if (matchFound) {
            System.out.println("Match located!");
            System.out.println("Positions: " + firstIndex + " and " + secondIndex);
            System.out.println("Numbers: " + list[firstIndex] + " and " + list[secondIndex]);
            System.out.println(list[firstIndex] + " + " + list[secondIndex] + " = " + goal);
        } else {
            System.out.println("No two numbers in the list add up to " + goal + ".");
        }

        input.close();
    }
}
