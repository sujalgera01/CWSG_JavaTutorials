package com.company;

interface Camera2{
    void takeSnap();
    void recordVideo();
}

interface wifi2{
    String[] getNetworks();
    void ConnectNetworks(String networks);
}

class cellPhone2{
    void callNum(int phone){
        System.out.println("Calling number: " + phone);
    }
    void pickCall(){
        System.out.println("Connecting....");
    }
}


class MySmartPhone2 extends cellPhone2 implements Camera2, wifi2{
    public void takeSnap(){
        System.out.println("taking Snap.");
    }
    public void recordVideo(){
        System.out.println("recording video.");
    }
    public String[] getNetworks(){
        System.out.println("getting list of networks..");
        String[] list = {"Sujal","Anmol","Chinu"};
        return list;
    }
    public void ConnectNetworks(String net){
        System.out.println("Connecting to : " + net);
    }
}


public class CWSG_polymorphism {
    public static void main(String[] args) {
        Camera2 c = new MySmartPhone2();
        c.recordVideo();

        MySmartPhone2 ms = new MySmartPhone2();
//        ms.ConnectNetworks();
//        ms.getNetworks();
//        ms.recordVideo();
//        ms.takeSnap();
    }
}
