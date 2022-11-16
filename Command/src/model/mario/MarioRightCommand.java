package model.mario;

import interfaces.Command;

public class MarioRightCommand implements Command {

    private MarioCharacterReceiver mario = new MarioCharacterReceiver();

    public MarioRightCommand(MarioCharacterReceiver mario) {
        this.mario = mario;
    }

    @Override
    public void execute() {
        mario.moveRight();
    }
}
