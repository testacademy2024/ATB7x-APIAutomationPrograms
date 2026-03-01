package com.thetestingacademy.ex_01032026_CRUD_E2E.testngexample;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGE2E_07 {
    @Parameters("browser")
    @Test
    void demo1(String value)
    {
        System.out.println("Browser is "+value);
    }

}
