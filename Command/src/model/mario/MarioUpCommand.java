package model.mario;

import interfaces.Command;

public class MarioUpCommand implements Command {

    private MarioCharacterReceiver mario = new MarioCharacterReceiver();

    public MarioUpCommand(MarioCharacterReceiver mario) {
        this.mario = mario;
    }

    @Override
    public void execute() {
        mario.moveUp();
    }
}
