package model;

import interfaces.HamburgerStore;

public class AmericanHamburgerStore extends HamburgerStore {

    @Override
    public Hamburger createHamburger(String type) {
        if(type.equals("cheese"))
            return new AmericanCheeseBurger();
        else
            return null;
    }

}
