package com.thetestingacademy.ex_03032026;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Verification001 {
    @Test
    public void VerifyTestNGAssertions()
    {
        String responsename="sanket";
        Assert.assertEquals("sanket",responsename);
    }
}
