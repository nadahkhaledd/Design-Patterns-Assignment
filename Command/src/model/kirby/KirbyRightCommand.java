package model.kirby;

import interfaces.Command;

public class KirbyRightCommand implements Command {

    private KirbyCharacterReceiver kirby = new KirbyCharacterReceiver();

    public KirbyRightCommand(KirbyCharacterReceiver kirby) {
        this.kirby = kirby;
    }

    @Override
    public void execute() {
        kirby.moveRight();
    }
}
