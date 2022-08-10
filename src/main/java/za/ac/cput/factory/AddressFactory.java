package za.ac.cput.factory;

/**
 * AddressFactory.java;
 * @Author: Nawaaz Amien - 219099839
 */

import za.ac.cput.domain.Address;
import za.ac.cput.util.StringHelper;

public class AddressFactory {
    public static Address build(String unitNumber, String complexName, String streetNumber, String streetName, String postalCode, String city) throws IllegalArgumentException
    {
        unitNumber = StringHelper.setEmptyIfNull(unitNumber);
        complexName = StringHelper.setEmptyIfNull(complexName);
        validateAttributes(streetNumber, streetName, postalCode, city);
        return new Address.Builder().setUnitNumber(unitNumber)
                .setComplexName(complexName)
                .setStreetNumber(streetNumber)
                .setStreetName(streetName)
                .setPostalCode(postalCode)
                .setCity(city).build();
    }

    private static void validateAttributes(String streetNumber, String streetName, String postalCode, String city) throws IllegalArgumentException
    {
        StringHelper.checkStringParam("streetNumber", streetNumber);
        StringHelper.checkStringParam("streetName", streetName);
        StringHelper.checkStringParam("postalCode", postalCode);
        StringHelper.checkIfObjectNull("city", city);
    }
}
