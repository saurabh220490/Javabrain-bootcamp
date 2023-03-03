package Session2Task;

/*
Assignment of InheritanceChallenge.java ----->

1.  Create an `Animal` class with member variables for the name and age of the animal and a constructor method that initializes the member variables.
2.  Create a `Dog` class that extends the `Animal` class and has a member variable for the breed of the dog and a constructor method that initializes the member variables.
3.  Override the `makeSound` method in the `Dog` class to print "The dog barks".
4.  Create a `Cat` class that extends the `Animal` class and has a member variable for the number of lives of the cat and a constructor method that initializes the member variables.
5.  Override the `makeSound` method in the `Cat` class to print "The cat meows".
6.  In the `main` method of this class, create an array of `Animal` objects and initialize it with a `Lion`, a `Dog`, a `Cat`, and another `Animal` of your choice.
7.  Loop through the array of `Animal` objects and print the name, age, and sound of each animal.
 */
public class Animal {
    String name;
    int age;
    public Animal(String animal_name, int animal_age){
        this.name = animal_name;
        this.age = animal_age;
    }
    public void makeSound(){
        System.out.println("Animal makes different sounds");
    }
}
class Dog extends Animal{
    String breed;
    public Dog(String animal_name, int animal_age,String breed){
        super(animal_name, animal_age);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("The dog barks");
    }
}
class Cat extends Animal{
    int num_of_lives;
    public Cat(String animal_name, int animal_age, int num_of_lives){
        super(animal_name,animal_age);
        this.num_of_lives=num_of_lives;
    }
    @Override
    public void makeSound(){
        System.out.println("The cat meows");
    }

    public static void main(String[] args) {
        Animal animal1 = new Animal("Lion", 15);
        Animal animal2 = new Dog("Hachi", 8, "Pomeranian");
        Animal animal3 = new Cat("Lucie", 5, 8);

        Animal[] obj = {animal1, animal2, animal3};

        for(int i=0; i< obj.length; i++){
            System.out.println("Animal name: "+obj[i].name+" and age : "+obj[i].age);
            obj[i].makeSound();
            System.out.println();
        }
    }
}
