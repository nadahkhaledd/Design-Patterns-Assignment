import model.GameBoy;
import model.kirby.*;
import model.mario.*;

public class Main {
    public static void main(String[] args) {
        //create receivers
        MarioCharacterReceiver mario = new MarioCharacterReceiver();
        mario.setName("Mario");

        KirbyCharacterReceiver kirby = new KirbyCharacterReceiver();
        kirby.setName("Kirby");

        //Commands
        MarioUpCommand marioUp = new MarioUpCommand(mario);
        MarioDownCommand marioDown = new MarioDownCommand(mario);
        MarioLeftCommand marioLeft = new MarioLeftCommand(mario);
        MarioRightCommand marioRight = new MarioRightCommand(mario);

        KirbyUpCommand kirbyUp = new KirbyUpCommand(kirby);
        KirbyDownCommand kirbyDown = new KirbyDownCommand(kirby);
        KirbyLeftCommand kirbyLeft = new KirbyLeftCommand(kirby);
        KirbyRightCommand kirbyRight = new KirbyRightCommand(kirby);

        //Invoker
        GameBoy gameBoy = new GameBoy(marioUp, marioDown, marioLeft, marioRight);
        gameBoy.arrowDown();

    }
}