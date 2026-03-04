package com.thetestingacademy.ex_03032026;


import io.qameta.allure.*;
import org.assertj.core.api.Assertions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static io.qameta.allure.SeverityLevel.CRITICAL;
import static org.assertj.core.api.Assertions.assertThat;
import java.time.LocalDate;
import java.util.Map;

//AssertJ and TestNG Assertions are mostly used in API Automation

public class Verification002 {
    @Description("This test attempts to log into the website using a login and a password. Fails if any error happens.Note that this test does not test 2-Factor Authentication")
    @Severity(CRITICAL)
    @Owner("John Doe")
    @Link(name = "Website", url = "https://dev.example.com/")
    @Issue("AUTH-123")
    @TmsLink("TMS-456")
    @Test
    public void VerifyAssertJAssertions()
    {
        String name="SANKET";
        assertThat(name).isEqualTo("SANKET").isNotEmpty().isNotNull();
        //AssertJ other usecases

        List<String> names= Arrays.asList("John","Jane","Doe");
        assertThat(names).hasSize(3).isNotNull().isNotEmpty();

        LocalDate date=LocalDate.now();
        System.out.println(date);
        assertThat(date)
                .isAfterOrEqualTo(LocalDate.of(2021,01,01))
                .isAfterOrEqualTo(LocalDate.of(2024,01,01))
                .isBetween(LocalDate.of(2023,1,1),LocalDate.of(2023,12,31));

        File file = new File("Testdata.json");
        assertThat(file).exists().isFile().canRead();

        Map<String, Integer> ages = new HashMap<>();
        ages.put("John", 25);
        ages.put("Jane", 30);

        assertThat(ages).hasSize(2).containsEntry("John",25).doesNotContainValue(40);

    }
}
