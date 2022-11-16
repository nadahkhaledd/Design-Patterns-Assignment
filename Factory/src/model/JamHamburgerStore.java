package model;

import interfaces.HamburgerStore;

public class JamHamburgerStore extends HamburgerStore {
    @Override
    public Hamburger createHamburger(String type) {
        if(type.equals("cheese"))
            return new JamCheeseBurger();
        else if (type.equals("greek"))
            return new JamGreekBurger();
        else
            return null;
    }
}
