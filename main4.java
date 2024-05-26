class A {
    public A(){
        System.out.println("Inside the A constructor.");
    }
    public A(String s){
        System.out.println("Inside the A constructor with 1 parameter" + s);
    }
    public A(String s,int n){
        System.out.println("Inside the A constructor with 2 parameters.");
    }

}

class B extends A{
    public B(){
        System.out.println("Inside the b constructor.");
    }
    public B(String s,int n){
        System.out.println("Inside the B  constructor." + s);
    }
}

class main4{
    public static void main(String[] args){
    // A obj = new A();
    // B obj2 = new B();
    // B obj = new B("prajjwal",12);
    B obj = new B();
    
}
}
