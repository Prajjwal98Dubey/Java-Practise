/*
- only abstract class can have the abstract method.
- if any class is inheriting an abstract class then it is mandatory to implement the abstract method in that sub class which is inheriting.
- we cannot create the object of the abstract class.
- it is mandatory that if the method is abstract then the class should be abstract as well but if the class is abstract then it may or may not have the abstract method as a compulsion.

 */
abstract class Car {
    abstract public void drive();
    public void playMusic(){
        System.out.println("Playing Music...");
    }
}
class BMW extends Car{
    public void drive(){
        System.out.println("Car is Running...");
    }
}

public class Main5 {
    public static void main(String [] args){
            BMW b = new BMW();
            b.drive();
            b.playMusic();

    }
}
