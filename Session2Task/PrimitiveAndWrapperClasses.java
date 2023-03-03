package Session2Task;

public class PrimitiveAndWrapperClasses {
    public static void main(String[] args) {
        // Step 1: Declare primitive variables
        int num = 8;
        char ch = 'k';

        // Step 2: Convert primitive variables to wrapper objects
        Integer numObject = Integer.valueOf(num);
        Character charObject = Character.valueOf(ch);

        // Step 3: Print the values of the wrapper objects
        System.out.println(numObject);
        System.out.println(charObject);

        // Step 4: Convert wrapper objects back to primitive variables
        num = numObject.intValue();
        ch = charObject.charValue();

        // Step 5: Print the values of the primitive variables
        System.out.println(num);
        System.out.println(ch);
    }
}
