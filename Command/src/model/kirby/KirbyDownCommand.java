package model.kirby;

import interfaces.Command;

public class KirbyDownCommand implements Command {

    private KirbyCharacterReceiver kirby = new KirbyCharacterReceiver();

    public KirbyDownCommand(KirbyCharacterReceiver kirby) {
        this.kirby = kirby;
    }

    @Override
    public void execute() {
        kirby.moveDown();
    }
}
