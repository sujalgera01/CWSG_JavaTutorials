package com.company;

class MyEmployee{
    private int id;
    private String name;

    public void setNames(String n){
        name = n;
    }

    public String getNames(){
        return name;
    }

    public void setIds(int i){
        id = i;
    }
    public int getIds(){
        return id;
    }

}

public class CWSG_accessModifiers {
    public static void main(String[] args) {
        MyEmployee obj = new MyEmployee();
        // obj.id = 54;
        // obj.name = "Sujal"; --> Throws an Error due to Private access modifier

        obj.setNames("Sujal Gera");
        System.out.println(obj.getNames());
        obj.setIds(10);
        System.out.println(obj.getIds());
    }
}
