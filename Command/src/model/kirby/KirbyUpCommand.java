package model.kirby;

import interfaces.Command;

public class KirbyUpCommand implements Command {

    private KirbyCharacterReceiver kirby = new KirbyCharacterReceiver();

    public KirbyUpCommand(KirbyCharacterReceiver kirby) {
        this.kirby = kirby;
    }

    @Override
    public void execute() {
        kirby.moveUp();
    }
}
