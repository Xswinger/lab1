package com.xswinger.part3.abstractClasses;

import java.util.List;

import com.xswinger.part3.interfaces.HumanInterface;
import com.xswinger.part3.interfaces.LocationInterface;

public abstract class Location implements LocationInterface {
    Location subLocation;

    List<HumanInterface> visitors;

    public void comeIn(HumanInterface human) {
        this.visitors.add(human);
    }

    public void leave(HumanInterface human) {
        this.visitors.remove(human);
    }

    public void setVisitors(List<HumanInterface> visitors) {
        this.visitors = visitors;
    }

    public List<HumanInterface> getVisitors() {
        return visitors;
    }

    public void setSubLocation(Location subLocation) {
        this.subLocation = subLocation;
    }

    public Location getSubLocation() {
        return subLocation;
    }
}
