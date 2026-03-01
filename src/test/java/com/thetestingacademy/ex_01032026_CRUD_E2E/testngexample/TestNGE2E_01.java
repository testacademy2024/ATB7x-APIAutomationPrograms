package com.thetestingacademy.ex_01032026_CRUD_E2E.testngexample;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGE2E_01 {
    @Description("Verify that actual and expected matches")
    @Severity(SeverityLevel.NORMAL)
@Test
    public void test_NGE2E01()
    {
        Assert.assertEquals(true,false);
    }
    @Description("Verify that actual and expected does not match")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    public void test_NGE2E02()
    {
        try {
            Assert.assertEquals(true,true);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
