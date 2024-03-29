package com.xswinger.part3.locations;

import java.util.List;

import com.xswinger.part3.interfaces.HumanInterface;
import com.xswinger.part3.abstractClasses.Location;

public class Tunnel extends Location {

    public Tunnel(List<HumanInterface> visitors) {
        setVisitors(visitors);
    }
    
}
