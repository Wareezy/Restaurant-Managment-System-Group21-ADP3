package za.ac.cput.factory;

import za.ac.cput.domain.Name;

public class NameFactory {
    public static Name createName(String firstName, String lastName){
        if (StringHelper.isNullOrEmpty(firstName) || StringHelper.isNullOrEmpty(lastName))
            throw new IllegalArgumentException();
        return new Name.Builder().setFirstName(firstName)
                .setMiddleName("")
                .setLastName(lastName)
                .build();
    }
    public static Name createName(String firstName,String middleName, String lastName){
        if (StringHelper.isNullOrEmpty(firstName) || StringHelper.isNullOrEmpty(lastName))
            throw new IllegalArgumentException();
        if (StringHelper.isNullOrEmpty(middleName))
            middleName="";
        return new Name.Builder().setFirstName(firstName)
                .setMiddleName(middleName)
                .setLastName(lastName)
                .build();
    }

}
