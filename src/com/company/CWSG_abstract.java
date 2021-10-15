package com.company;

abstract class Base{
    Base(){
        System.out.println("i am a constructor");
    }
    public void sayHello(){
        System.out.println("Hello");
    }

    abstract void greet();
}

class child extends Base{
    @Override
    public void greet(){
        System.out.println("Helloooo");
    }
}

// need to add abstract for more classes
abstract class child2 extends Base{
    public void demo(){
        System.out.println("Demo");
    }
}

public class CWSG_abstract {
    public static void main(String[] args) {
//        Base b = new Base(); -> not possible (abstract)
        child c = new child();
//        child2 c2 = new child2();  -> not possible. (abstract)
    }
}
