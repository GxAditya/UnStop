import java.util.*;

public class Main {
    // Placeholder function for user logic
    public static int findLargestNumber(List<Integer> arr) {
         Collections.sort(arr);
    int a = arr.get(0);
    int b = arr.get(1);

    // Form two possible numbers
    int num1 = Integer.parseInt("" + a + b);
    int num2 = Integer.parseInt("" + b + a);

    // Return the maximum of the two
    return Math.max(num1, num2);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(scanner.nextInt());
        }
        // Call user logic function and print the output
        int result = findLargestNumber(arr);
        System.out.println(result);
    }
}