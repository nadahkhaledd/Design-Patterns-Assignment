import interfaces.HamburgerStore;
import model.AmericanHamburgerStore;
import model.Hamburger;
import model.JamHamburgerStore;

public class Main {
    public static void main(String[] args) {
        HamburgerStore jamaicanStore = new JamHamburgerStore();
        HamburgerStore americanStore = new AmericanHamburgerStore();

        Hamburger hamburger = jamaicanStore.orderHamburger("greek");
        System.out.println("Nadah ordered " + hamburger.name);

        System.out.println();
        hamburger = americanStore.orderHamburger("cheese");
        System.out.println("Nadah ordered " + hamburger.name);


    }
}