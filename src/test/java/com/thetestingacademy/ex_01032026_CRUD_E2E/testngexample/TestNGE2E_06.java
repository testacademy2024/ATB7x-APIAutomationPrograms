package com.thetestingacademy.ex_01032026_CRUD_E2E.testngexample;

import org.testng.annotations.Test;

public class TestNGE2E_06 {
    @Test
    public void machinestart()
    {
        System.out.println("I will run first");
    }
    @Test(dependsOnMethods ="machinestart")
    public void openide()
    {
        System.out.println("Open IntelliJ IDE");
    }
}
