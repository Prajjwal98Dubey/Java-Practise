/*
- constructor should always have the name of the class.
- every class in java extends the object class.
- default constructor and parameterised constructor
- super keyword should always be the first statement inside the constructor.
- method overloading -> in which inside a same class the methods have same name but different number of parameters.
- if final is with variable then it acts as const which means its value cannot be changed.
- if final is with methods then that method cannot be "overridden" by the subclasses. 
- if final is with the class then that class cannot be parent which no other class can inherit the final class.
wrapper class , final    -> 7:58
 */

/*
 class A {
    final public void show(){
        System.out.println("This is inside the A class.");
    }
}
class B extends A {
    public void show(){
        System.out.println("This is inside the B class.");
    }
}

class Main3{
    public static void main(String[] args){

        B obj = new B();
        obj.show();
        // System.out.print(n);
    }
}

*/
final class A {
    public void show(){
        System.out.println("This is inside the A class.");
    }
}
class B{
    public void show(){
        System.out.println("This is inside the B class.");

    }
}
class C extends B{
    public void show(){
        System.out.println("This is inside the C class.");
    }
}
class Main3{
    public static void main(String[] args){
            C obj = new C();
            obj.show();
    }
}

/*

class A{
    public A(){
        System.out.println("Inside Class A");
    }
    public A(int n){
        System.out.println("Inside the parameterise Constructor of A.");
    }
}

class B extends A {
    public B(int n){
        super(n);
        System.out.println("Inside Class B");
    }
}
class Main3{
    public static void main(String[] args){
        // B obj = new B(2);
        // A obj = new A();
        A obj2 = new A();
    }
}

*/


/*
"this" signifies curr object.
class Human{
    private String name;
    private int age;
    
    public void setName(String name){
        this.name = name;
        // this signifies that name in the this.name is the instance variable of the current object which is created ,it differentiates the local variable with the instance variable.
    }
    public void getName(){
        System.out.println("My Name is :" + name);
    }

}

class Main3{
    public static void main(String[] args){
        Human obj = new Human();
        obj.setName("Prajjwal");        
        obj.getName();
    }
}

*/