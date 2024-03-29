package com.xswinger.part3.entities;

import com.xswinger.part3.enums.Gender;
import com.xswinger.part3.enums.HumanCondition;
import com.xswinger.part3.interfaces.HumanInterface;

public class Human implements HumanInterface {

    private String name;

    private Gender gender;

    private HumanCondition innerCondition;

    private HumanCondition outterCondition;

    private Flashlight flashlight = new Flashlight(false);

    public Human(String name, Gender gender) {
        this.gender = gender;
        this.name = name;
    }

    @Override
    public boolean illuminate() {
        if (!flashlight.getCondition()) {
            flashlight.switchOn();
        }

        if (flashlight.getCondition()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void changeInnerCondition(HumanCondition newCondition) {
        this.innerCondition = newCondition;
    }

    @Override
    public void changeOutterCondition(HumanCondition newCondition) {
        this.outterCondition = newCondition;
    }

    @Override
    public HumanCondition getInnerCondition() {
        return innerCondition;
    }

    @Override
    public HumanCondition getOutterCondition() {
        return outterCondition;
    }

    @Override
    public Gender getGender() {
        return gender;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

}
