package model.adapter;

import interfaces.SocketAdapter;
import model.Socket;
import model.Volt;

public class SocketObjectAdapter implements SocketAdapter {
    private Socket socket = new Socket();

    @Override
    public Volt get120Volts() {
        return socket.getVolt();
    }

    @Override
    public Volt get12Volts() {
        return convertVolt(socket.getVolt(), 10);
    }

    @Override
    public Volt get30Volts() {
        return convertVolt(socket.getVolt(), 4);
    }

    private Volt convertVolt(Volt volts, int divider){
        return new Volt(volts.getVolts()/divider);
    }
}
