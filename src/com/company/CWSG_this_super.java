package com.company;

class EkClass{
    int a;
    public int getA() {
        return a;
    }
    EkClass(int a){
        this.a = a;
    }
    public int returnone(){
        return 1;
    }
}

class DoClass extends EkClass{
    DoClass(int a) {
        super(a);
        System.out.println("I am a constructor");
    }
}

public class CWSG_this_super {
    public static void main(String[] args) {
//        EkClass e = new EkClass(5);
        DoClass d = new DoClass(10);
        System.out.println(d.getA());
    }
}
