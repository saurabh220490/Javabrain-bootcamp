package Session2Task;

/*
Assignment of ClassAndObjects.java file----->

1.  Create a class called `Car` with member variables for the make, model, and year of the car.
2.  Create a constructor method for the `Car` class that initializes the member variables.
3.  Create getter methods for the make, model, and year.
4.  Create a `toString` method that returns a string representation of the car in the form "year make model".
5.  In the `main` method of this class, create a `Car` object with a make, model, and year of your choice.
6.  Use the member variables and methods of the `Car` class to print the make, model, and year of the car.
7.  The expected output of the program is:

```
Make: Toyota
Model: Camry
Year: 2020
Details: 2020 Toyota Camry
```

 */
public class Car {
    String Make;
    String Model;
    int Year;
    public Car(String Make, String Model, int Year){
        this.Make = Make;
        this.Model = Model;
        this.Year = Year;
    }
    public String getMake(){
        return this.Make;
    }
    public String getModel(){
        return this.Model;
    }
    public int getYear(){
        return this.Year;
    }

    public String toString(){
        return this.Year+" "+this.Make+" "+this.Model;
    }

    public static void main(String[] args) {
        Car carObj = new Car("Tata", "Harrier", 2020);
        Car carObj2 = new Car("Skoda", "Kushaq", 2019);

        System.out.println("Make: "+carObj.Make);
        System.out.println("Model: "+carObj.Model);
        System.out.println("Year: "+carObj.Year);
        System.out.println(carObj);
        System.out.println("=======================================");
        System.out.println("Make: "+carObj2.getMake());
        System.out.println("Model: "+carObj2.getModel());
        System.out.println("Year: "+carObj2.getYear());
        System.out.println(carObj2);
    }
}
