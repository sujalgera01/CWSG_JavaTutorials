package com.company;

interface Bicycle{
    int x = 10;
    void applyBrake(int dec);
    void speedUp(int inc);
}

interface HornBicycle{
    void playHorn();
    void stopHorn();
}

class AvonCycle implements Bicycle, HornBicycle{
    public void applyBrake(int dec){
        System.out.println("Applying Brakes..");
    }
    public void speedUp(int inc){
        System.out.println("Speeding Up...");
    }
    public void playHorn(){
        System.out.println("playing Horn. Poo Poo Pee Pee");
    }
    public void stopHorn(){
        System.out.println("Stopping Horn. Shhhhh Shhh");
    }
}

public class CWSG_interfaces {
    public static void main(String[] args) {
        AvonCycle a = new AvonCycle();
        a.applyBrake(2);
        a.speedUp(5);
        System.out.println(a.x);
//        x = 100;  ->  Not Applicable as integer x is finalized in Interfaces
        a.playHorn();
        a.stopHorn();

    }
}
