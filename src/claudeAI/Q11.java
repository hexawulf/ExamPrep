package claudeAI;
//Exercise 11: Method Overriding
//Target Concept: Method overriding in inheritance
//Extend Exercise 10 by adding a method displayInfo() to both the Vehicle and Car classes. The Car class should override the method to include the model information.


public class Q11 //Target concept: Method Overriding
{
    public static void main(String[] args) {
        Vehicle v = new Vehicle("Toyota", 2020);
        v.displayInfo();

        System.out.println();

        Car c = new Car("Honda", 2022, "Civic");
        c.displayInfo();
    }
}