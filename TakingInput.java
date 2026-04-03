import java.util.Scanner;

public class TakingInput {
    public static void main() {
        Scanner hr = new Scanner(System.in);

        System.out.print("Enter the value for firstNum: ");
        int firstNum = hr.nextInt();

        System.out.print("Enter the value for secondNum: ");
        int secondNum = hr.nextInt();

        int ans = firstNum + secondNum;
        System.out.println("Answer is: " + ans);

        hr.close();
    }
}