import subsystem.CPU;
import subsystem.HardDrive;
import subsystem.Memory;

public class Computer {
    private CPU processor;
    private HardDrive hardDrive;
    private Memory ram;

    public Computer(CPU processor, HardDrive hardDrive, Memory ram) {
        this.processor = processor;
        this.hardDrive = hardDrive;
        this.ram = ram;
    }

    public void start(){
        processor.freeze();
        ram.load("F23A6D75");
        processor.jump("F23A6D75");
        processor.execute();
    }
}
