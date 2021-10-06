package com.company;

class A{
    public int a;
    public int meth1(){
        return 4;
    }

    public void meth2() {
        System.out.println("I am a meth2 from class A");
    }
}

class B extends A{
    public void meth2(){
        System.out.println("I am a meth2 from class  B");
    }

    public void meth3(){
        System.out.println("I am a meth3 from class B");
    }
}

public class CWSG_method_overriding {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();

        B b = new B();
        b.meth2();

    }
}
