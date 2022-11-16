package model.kirby;

public class KirbyCharacterReceiver {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void moveUp(){
        System.out.println(getName() + " Jumping up");
    }

    public void moveDown(){
        System.out.println(getName() + " Jumping down");
    }

    public void moveLeft(){
        System.out.println(getName() + " Jumping left");
    }

    public void moveRight(){
        System.out.println(getName() + " Jumping right");
    }
}
