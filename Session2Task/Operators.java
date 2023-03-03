package Session2Task;

public class Operators {
    public static void main(String[] args) {
        // Step 1: Declare variables
        int num1= 68;
        int num2= 15;

        // Step 2: Perform arithmetic operations
        int add = num1+num2;
        int sub= num1-num2;
        int mul = num1*num2;
        int div = num1/num2;
        int mod = num1%num2;


        // Step 3: Print the results of the arithmetic operations
        System.out.println(add);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(mod);

        // Step 4: Perform increment and decrement operations
        num1 += 1;
        num2-= 1;

        // Step 5: Print the results of the increment and decrement operations
        System.out.println(num1);
        System.out.println(num2);

        // Step 6: Perform comparison operations
        // Step 7: Print the results of the comparison operations
        System.out.println(num1==num2);
        System.out.println(num1>num2);

        // Step 8: Perform logical operations
        // Step 9: Print the results of the logical operations
        System.out.println(num1 > num2 && num1 == num2);
        System.out.println(num1 <= num2 || num1 >= num2);
    }
}
