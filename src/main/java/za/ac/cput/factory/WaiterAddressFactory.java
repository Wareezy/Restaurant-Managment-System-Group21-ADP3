package za.ac.cput.factory;

/**
 * WaiterAddressFactory.java;
 * @Author: Nawaaz Amien - 219099839
 */

import za.ac.cput.domain.Address;
import za.ac.cput.domain.WaiterAddress;
import za.ac.cput.util.StringHelper;

public class WaiterAddressFactory {
    public static WaiterAddress build(String waiterId, Address address) throws IllegalArgumentException
    {
        validateAttributes(waiterId, address);
        Address address2 = AddressFactory.build(address.getUnitNumber(), address.getComplexName(), address.getStreetNumber(), address.getStreetName(), address.getPostalCode(), address.getCity());

        return new WaiterAddress.Builder()
                .setWaiterId(waiterId)
                .setAddress(address).build();
    }

    private static void validateAttributes(String waiterId, Address address) throws IllegalArgumentException
    {
        StringHelper.checkIfObjectNull("address", address);
        StringHelper.checkStringParam("waiterId", waiterId);
        StringHelper.checkStringParam("streetNumber", address.getStreetNumber());
        StringHelper.checkStringParam("streetName", address.getStreetName());
        StringHelper.checkStringParam("postalCode", address.getPostalCode());
        StringHelper.checkIfObjectNull("city", address.getCity());
    }
}
