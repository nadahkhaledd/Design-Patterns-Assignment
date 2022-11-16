package model.adapter;

import interfaces.SocketAdapter;
import model.Socket;
import model.Volt;

public class SocketAdapterImplementation extends Socket implements SocketAdapter {
    @Override
    public Volt get120Volts() {
        return getVolt();
    }

    @Override
    public Volt get12Volts() {
        return convertVolt(getVolt(), 10);
    }

    @Override
    public Volt get30Volts() {
        return convertVolt(getVolt(), 4);
    }

    private Volt convertVolt(Volt volts, int divider){
        return new Volt(volts.getVolts()/divider);
    }
}
