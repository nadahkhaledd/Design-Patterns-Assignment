package model.mario;

import interfaces.Command;

public class MarioDownCommand implements Command {

    private MarioCharacterReceiver mario = new MarioCharacterReceiver();

    public MarioDownCommand(MarioCharacterReceiver mario) {
        this.mario = mario;
    }

    @Override
    public void execute() {
        mario.moveDown();
    }
}
