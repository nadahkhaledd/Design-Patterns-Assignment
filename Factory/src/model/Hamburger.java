package model;

public abstract class Hamburger {
    public String name;
    public String sauce;

    public void prepare(){
        System.out.println("Preparing " + name);
        System.out.println("Adding " + sauce);
    }

    public void cook(){
        System.out.println("Cooking...");
    }

    public void box(){
        System.out.println("Boxing...");
    }
}
