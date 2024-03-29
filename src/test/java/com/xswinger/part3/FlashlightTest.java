package com.xswinger.part3;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.xswinger.part3.entities.Flashlight;

public class FlashlightTest {

    @Test
    public void lightOnTest() {
        Flashlight flashlight = new Flashlight(false);

        flashlight.switchOn();

        assertTrue(flashlight.getCondition());
    }

    @Test
    public void lightOffTest() {
        Flashlight flashlight = new Flashlight(true);

        flashlight.switchOff();

        assertFalse(flashlight.getCondition());
    }

}
