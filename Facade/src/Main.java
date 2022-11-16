import subsystem.CPU;
import subsystem.HardDrive;
import subsystem.Memory;

/*
 * provides unified interface for multiple interfaces.
 */
public class Main {

    public static void main(String[] args) {
        CPU processor = new CPU();
        HardDrive hardDrive = new HardDrive();
        Memory ram = new Memory();

        Computer computer = new Computer(processor, hardDrive, ram);
        computer.start();
    }
}