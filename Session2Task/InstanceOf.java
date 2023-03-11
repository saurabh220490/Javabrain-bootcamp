package Session2Task;

public class InstanceOf {
    public static void main(String[] args) {
        Object[] objects = {
                10,
                "Hello",
                true,
                20.5
        };

        // Challenge: Use instanceof to determine the type of each object in the array
        for(Object o : objects ){
            if(o instanceof String){
                System.out.println("It's a string");
            } else if (o instanceof Integer) {
                System.out.println("It's an integer");
            } else if (o instanceof Boolean) {
                System.out.println("It's a boolean");
            }
            else { // @KetanKBaboo putting specific condition might be helpful 
                System.out.println("It's a float");
            }
        }
    }
}
