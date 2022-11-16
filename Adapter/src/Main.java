import interfaces.SocketAdapter;
import model.adapter.SocketAdapterImplementation;
import model.adapter.SocketObjectAdapter;
import model.Volt;

public class Main {
    public static void main(String[] args) {
        testingClassAdapter();
        testingObjectAdapter();

    }

    private static void testingClassAdapter(){
        SocketAdapter socketAdapter = new SocketAdapterImplementation();
        Volt v12 = getVolt(socketAdapter, 12);
        Volt v30 = getVolt(socketAdapter, 30);
        Volt v120 = getVolt(socketAdapter, 120);

        System.out.println("v12 working: " + v12.getVolts());
        System.out.println("v30 working: " + v30.getVolts());
        System.out.println("v120 working: " + v120.getVolts());
        System.out.println();
    }

    private static void testingObjectAdapter(){
        SocketAdapter socketAdapter = new SocketObjectAdapter();
        Volt v12 = getVolt(socketAdapter, 12);
        Volt v30 = getVolt(socketAdapter, 30);
        Volt v120 = getVolt(socketAdapter, 120);

        System.out.println("v12 working: " + v12.getVolts());
        System.out.println("v30 working: " + v30.getVolts());
        System.out.println("v120 working: " + v120.getVolts());
        System.out.println();
    }

    private static Volt getVolt(SocketAdapter socketAdapter, int divider){
        switch (divider){
            case 12: return socketAdapter.get12Volts();
            case 30: return socketAdapter.get30Volts();
            case 120: return socketAdapter.get120Volts();
            default: return socketAdapter.get120Volts();
        }

    }

}