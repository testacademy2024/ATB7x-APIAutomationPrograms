package com.thetestingacademy.ex_01032026_CRUD_E2E.testngexample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGE2E_08 {
    @Test
    public void test_01()
    {
        Assert.assertEquals(true,true);
    }
    @Test(enabled = false)  //skip the test case as of now
    public void test_02()
    {
        Assert.assertEquals(true,false);
    }
    @Test(alwaysRun = true) //always running even if preceding test case fails
    public void test_03()
    {
        Assert.assertEquals(true,true);
    }
}
