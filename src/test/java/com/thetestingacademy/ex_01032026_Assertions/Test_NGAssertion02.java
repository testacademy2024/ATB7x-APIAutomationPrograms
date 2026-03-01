package com.thetestingacademy.ex_01032026_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test_NGAssertion02 {
    @Test
    public void hardAssertexample()
    {
        Assert.assertTrue(false);
        System.out.println("This line will not be executed");
    }
    @Test
    public void softAssertExample()
    {
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(false);//This will not stop execution
        System.out.println("This line will be executed");
        softAssert.assertAll();//this will report all collected errors
    }
}
