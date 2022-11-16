package subsystem;

public class CPU {
    public void freeze(){
        System.err.println("Computer freezing...");
    }

    public void jump(String position){
        System.out.println("Jumping to position " + position);
    }

    public void execute(){
        System.out.println("Executing commands...");
    }
}
