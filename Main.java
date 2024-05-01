package HalfAdder;
import java.util.Scanner;
import HalfAdder.Gates.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HalfAdder adder = new HalfAdder();

        System.out.println("Enter the first boolean value:\n");
        boolean input1 = scanner.nextBoolean();
        System.out.println("Enter the second boolean value:\n");
        boolean input2 = scanner.nextBoolean();
        
        boolean[] res = adder.add(input1, input2);
        int sum = res[0] ? 1 : 0;
        int carry = res[1] ? 1 : 0;

        System.out.printf("The sum is %d, the carry is %d\n", sum, carry);
        System.out.println();
        adder.info();
    }
}