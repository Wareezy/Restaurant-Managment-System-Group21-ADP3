package za.ac.cput.factory;


import za.ac.cput.domain.ChefAddress;


public class ChefAddressFactory {
    public static ChefAddress build(String chefId, String unitNumber, String complexName, String streetNumber
            , String streetName, String postalCode, String city) {

        if (StringHelper.isEmptyOrNull(chefId) || StringHelper.isNullorEmpty(unitNumber))
            throw new IllegalArgumentException("chefID and unit-Number required");

        if (StringHelper.isEmptyOrNull(complexName) || StringHelper.isNullorEmpty(streetNumber))
            throw new IllegalArgumentException("complexName and streetNumber required");

        if (StringHelper.isEmptyOrNull(streetName) || StringHelper.isNullorEmpty(postalCode))
            throw new IllegalArgumentException("streetName and postalCode required");
        if (city == null)
            throw new IllegalArgumentException("City required");


    }
    public static ChefAddress.Builder createChefAddress(ChefAddress chefAddress){
        return new ChefAddress.Builder(chefAddress.getChefId());

}
}
