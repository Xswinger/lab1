package com.xswinger.part3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.xswinger.part3.entities.Human;
import com.xswinger.part3.enums.Gender;
import com.xswinger.part3.enums.HumanCondition;
import com.xswinger.part3.interfaces.HumanInterface;

public class HumanTest {

    private HumanInterface human = new Human("Зафод", Gender.MALE);

    @Test
    public void illuminateTest() {
        assertTrue(human.illuminate());
    }

    @Test
    public void changeInnerConditionTest() {
        human.changeInnerCondition(HumanCondition.FEAR);

        assertEquals(human.getInnerCondition(), HumanCondition.FEAR);
    }

    @Test
    public void changeOutterConditionTest() {
        human.changeOutterCondition(HumanCondition.BRAVE);

        assertEquals(human.getOutterCondition(), HumanCondition.BRAVE);
    }
}
