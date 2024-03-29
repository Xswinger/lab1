package com.xswinger.part3.interfaces;

import com.xswinger.part3.enums.Gender;
import com.xswinger.part3.enums.HumanCondition;

public interface HumanInterface {
    void changeInnerCondition(HumanCondition newCondition);

    void changeOutterCondition(HumanCondition newCondition);

    boolean illuminate();

    public HumanCondition getInnerCondition();

    public HumanCondition getOutterCondition();

    public Gender getGender();

    public String getName();

    public void setGender(Gender gender);

    public void setName(String name);
}
