package za.ac.cput.factory;

/**
 * AddressFactoryTest.java;
 * @Author: Nawaaz Amien - 219099839
 */

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Address;
import static org.junit.jupiter.api.Assertions.*;

class AddressFactoryTest {
    @Test
    public void buildWithSuccess()
    {
        Address address=AddressFactory.build("19","Pelican Heights","8","Rockhill Way","7945", "Cape Town");
        System.out.println(address);
        assertNotNull(address);
    }
    @Test
    void buildWithError()
    {
        Exception exception=assertThrows(IllegalArgumentException.class,()-> AddressFactory.build(null,"Pelican Heights","8","Rockhill Way","7945", "Cape Town"));
        String exceptionMessage=exception.getMessage();
        System.out.println(exceptionMessage);
        assertSame("Unit Number is required",exceptionMessage);
    }

}