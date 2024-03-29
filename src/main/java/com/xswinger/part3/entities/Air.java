package com.xswinger.part3.entities;

import com.xswinger.part3.abstractClasses.Location;
import com.xswinger.part3.enums.Smell;

public class Air {
    private Smell smells;

    private Location location;

    public Air() {}

    public Air(Location location) {
        this.location = location;
    }

    public Smell getSmells() {
        return smells;
    }

    public void setSmells(Smell smells) {
        this.smells = smells;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
