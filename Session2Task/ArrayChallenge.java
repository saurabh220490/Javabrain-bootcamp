package Session2Task;

public class ArrayChallenge {
    public static void main(String[] args) {
        // Step 1: Create an array of integers
        int[] num = {1,3,5,7,11};


        // Step 2: Use arrays and array operations to find the sum, average, and largest number in the array
        int sum = 0;
        int largest = num[0];

        for (int j : num) {
            sum = j + sum;
            if (j > largest) {
                largest = j;
            }
        }
        double avg = sum / num.length;
        System.out.println("sum of the array elements "+sum);
        System.out.println("The largest element is "+largest);
        System.out.println("Average is "+avg);
    }
}
