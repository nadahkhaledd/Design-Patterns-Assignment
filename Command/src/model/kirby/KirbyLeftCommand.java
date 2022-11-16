package model.kirby;

import interfaces.Command;

public class KirbyLeftCommand implements Command {

    private KirbyCharacterReceiver kirby = new KirbyCharacterReceiver();

    public KirbyLeftCommand(KirbyCharacterReceiver kirby) {
        this.kirby = kirby;
    }

    @Override
    public void execute() {
        kirby.moveLeft();
    }
}
