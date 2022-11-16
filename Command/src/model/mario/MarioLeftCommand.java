package model.mario;

import interfaces.Command;

public class MarioLeftCommand implements Command {

    private MarioCharacterReceiver mario = new MarioCharacterReceiver();

    public MarioLeftCommand(MarioCharacterReceiver mario) {
        this.mario = mario;
    }

    @Override
    public void execute() {
        mario.moveLeft();
    }
}
