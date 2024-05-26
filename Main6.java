/*
 Inner Class -
 */
/* 
class A {
    int age;

    public void show() {
        System.out.println("Inside the class A.");
    }

    class B {
        public void config() {
            System.out.println("Inside the class B.");
        }
    }
}

public class Main6 {
    public static void main(String[] args) {
            A obj = new A();
            // to access the inner class of A
            A.B obj1 = obj.new B();
            obj1.config();
    }       
}

*/

/*
   
 */

class A {
    public void show(){
        System.out.println("Inside the class A.");
    }
 }

class Main6{
    public static void main(String[] args){
        // this is the way of implementing a different functionality of a same method. and this is called anonyomous class.
        A obj = new A()
        {
            public void show(){
                System.out.println("Inside the class A with new implementation.");
            }
        };
        obj.show();
    }
 }
