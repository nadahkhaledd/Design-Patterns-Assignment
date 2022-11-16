package interfaces;

import model.Volt;

public interface SocketAdapter {

    Volt get120Volts();
    Volt get12Volts();
    Volt get30Volts();
}
