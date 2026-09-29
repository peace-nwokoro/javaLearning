public class Car {
    String brand;
    String model;
    String color;
    int year;


public static void main(String[] args) {

    Car car1= new Car();
    Car car2= new Car();
    Car car3= new Car();

    car1.brand= "Toyota";
    car1.model= "Camry";
    car1.year= 2020;
    car1.color="black"; 

    car2.brand= "Lexus";
    car2.model= "ES 350";
    car2.year= 2007;
    car2.color="silver";

    car3.brand= "Mercedez";
    car3.model= "G-Wagon";
    car3.year= 2022;
    car3.color="Gray";
    System.out.println("I love my" + " " + car3.color + " " +" " + car3.brand +" " + car3.model );

    int speed = 140;
    String name = "baby";

    car1.drive(140, "baby"); 

    }
static void drive(int speed) {
    System.out.println("I am driving my new car at" + " "+ speed + "km");
    } 
static void drive(int speed, String name) {
    System.out.println("I call it my" + " " + name + " " + "because it makes me happy");
}
}
