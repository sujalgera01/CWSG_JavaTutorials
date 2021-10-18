package com.company;

class c1{
    public int x = 45;
    protected int y = 30;
    int z = 15;
    private int w = 60;

    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(w);
    }
}

public class CWSG_access_modifier {
    public static void main(String[] args) {
        c1 c = new c1();
//      same class Testing..
        c.meth1();

//        Same Package testing...
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
//        System.out.println(c.w); --> Cannot access in same package as it is private.

    }
}
