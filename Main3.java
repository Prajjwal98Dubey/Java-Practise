/*
- constructor should always have the name of the class.
- every class in java extends the object class.
- default constructor and parameterised constructor
 */


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