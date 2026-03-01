package com.thetestingacademy.ex_01032026_CRUD_E2E.testngexample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGE2E_09 {
    @Test
    public void test_01()
    {
        Assert.assertTrue(true);
    }
    @Test(enabled = false)  //skip the test case as of now
    public void test_02()
    {
        Assert.assertTrue(false);
    }
    @Test(alwaysRun = true) //always running even if preceding test case fails
    public void test_03()
    {
        Assert.assertTrue(true);
    }
}
