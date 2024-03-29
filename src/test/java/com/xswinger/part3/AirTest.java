package com.xswinger.part3;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.xswinger.part3.abstractClasses.Location;
import com.xswinger.part3.entities.Air;
import com.xswinger.part3.enums.Smell;
import com.xswinger.part3.interfaces.HumanInterface;
import com.xswinger.part3.locations.Tunnel;

public class AirTest {

    private Air air = new Air();

    private Location location;

    private List<HumanInterface> visitors;

    @Before
    public void preparationTunnelLocationAndNoVisitors() {
        this.visitors = new ArrayList<>();
        this.location = new Tunnel(visitors);

        air.setLocation(this.location);
    }

    @Test
    public void setSmellTest() {

        this.air.setSmells(Smell.GAR);

        assertEquals(this.air.getSmells(), Smell.GAR);
    }

}
