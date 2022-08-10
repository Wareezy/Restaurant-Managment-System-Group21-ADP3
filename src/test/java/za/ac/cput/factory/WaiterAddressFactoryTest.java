package za.ac.cput.factory;

/**
 * WaiterAddressFactoryTest.java;
 * @Author: Nawaaz Amien - 219099839
 */

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Address;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.jupiter.api.Assertions.*;

class WaiterAddressFactoryTest {

    private Address Address;

    @Test
    void buildWithError()
    {
        Exception exception=assertThrows(IllegalArgumentException.class,()-> WaiterAddressFactory.build("007",Address));
        String exceptionMessage=exception.getMessage();
        System.out.println(exceptionMessage);
        assertSame("Waiter ID is required",exceptionMessage);
    }

    @Test
    public void createEmployeeAddressTest()
    {

        Address address = AddressFactory.build("8", "Pelican Heights ", "9", "Rockhill Way ", "7945", "Cape Town");

        var results = assertThrows(IllegalArgumentException.class, () -> WaiterAddressFactory.build(null, address));
        var resultsTwo = assertThrows(IllegalArgumentException.class, () -> WaiterAddressFactory.build("", address));
        var resultsThree = assertThrows(IllegalArgumentException.class, () -> WaiterAddressFactory.build("007", null));

        assertThat(results.getMessage(), containsString("Invalid value for:"));
        assertThat(resultsTwo.getMessage(), containsString("Invalid value for:"));
        assertThat(resultsThree.getMessage(), containsString("address is null"));
        assertDoesNotThrow(() -> WaiterAddressFactory.build("007", address));
    }
}