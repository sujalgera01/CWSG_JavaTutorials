package com.company;

interface SampleInterface{
    void meth1();
    void meth2();
}

interface ChildSampleInterface extends SampleInterface{
    void meth3();
}

class MySampleClass implements ChildSampleInterface{
    public void meth3(){
        System.out.println("I am Meth3");
    }
    public void meth1(){
        System.out.println("I am Meth1");
    }
    public void meth2(){
        System.out.println("I am Meth2");
    }
}

public class CWSG_inheritance_in_interface {
    public static void main(String[] args) {
        MySampleClass o = new MySampleClass();
        o.meth1();
        o.meth2();
        o.meth3();
    }
}
