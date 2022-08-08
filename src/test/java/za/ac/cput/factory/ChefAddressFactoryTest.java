package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.ChefAddress;

import static org.junit.jupiter.api.Assertions.*;

class ChefAddressFactoryTest {
    @Test
    void test(){
        ChefAddress chefAddress = ChefAddressFactory.build("1482","85","Court"
        ,"8dankFud","hungry","6666","angry");
        assertNotNull(chefAddress);
        System.out.println(chefAddress);
    }


}