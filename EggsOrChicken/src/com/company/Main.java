package com.company;

public class Main {

    public static void main(String[] args) {
        Animals chicken = new Animals("Петуч");
        Animals egg = new Animals("Eggiochka");
        egg.start();
        chicken.start();
        try{
            egg.join();
            if (chicken.isAlive()) {
                System.out.println("Первенсто Петуча");
            } else {
                System.out.println("Первенство Eggiochka");
            }
        }
        catch (Exception ex){
            ex.getMessage();
        }
    }
}
class Animals extends Thread{
    String animalName;

    Animals(String name){
        animalName = name;
    }

    public void run(){
        for(int i = 0; i < 5; i++) {
            try {
                System.out.println(animalName);
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}