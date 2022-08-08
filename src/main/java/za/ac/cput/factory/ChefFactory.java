package za.ac.cput.factory;
/* ChefFactory.java
        factory
        Author: Aristoteles Pascoal (218290276)
        Date: 7 august 2022
        */
import za.ac.cput.domain.Chef;


public class ChefFactory {
    public static Chef createChef(String id,  String email,String firstName,String middleName,String lastName) {

        //String chefId = StringHelper.generateChefId();
        if (StringHelper.isEmptyOrNull(id) || StringHelper.isNullorEmpty(email))
            throw new IllegalArgumentException();
        Name name  = NameFactory.creatName(firstName,middleName,lastName);
        if (name == null)
            throw new IllegalArgumentException("no name present");

        if (StringHelper.isValidEmail(email))
            throw new IllegalArgumentException("invalid email");
        return new Chef.Builder().setChefId(id)
                .setChefEmail(email)
                .setName(name)
                .build();


    }

}
