package com.thetestingacademy.ex_01032026_CRUD_E2E.testngexample;

import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;

public class TestNGE2E_05 {
    @Test(groups = {"sanity", "qa", "preprod"})
    public void sanityRun() {
        System.out.println("Sanity");
        System.out.println("QA");
        Assert.assertTrue(true);
    }
    @Test(groups = {"qa","preprod", "reg"})
    public void RegRun(){
        System.out.println("Reg");
        Assert.assertTrue(true);
    }
    @Test(groups = {"dev","stage"})
    public void SmokeRun(){
        System.out.println("Smoke");
        Assert.assertTrue(true);
    }

}
