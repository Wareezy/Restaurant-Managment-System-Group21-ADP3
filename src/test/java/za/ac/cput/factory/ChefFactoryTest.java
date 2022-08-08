package za.ac.cput.factory;
/* ChefFactoryTest.java
        FactoryTest
        Author: Aristoteles Pascoal (218290276)
        Date: 7 august 2022
        */
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Chef;
import static org.junit.jupiter.api.Assertions.*;
class ChefFactoryTest {
    @Test
    void createChef(){
        Chef chef = ChefFactory.createChef("12sad", "asdfsd@gmail.com"
                ,"Daniel"
                ,"",
                "Lobolo");
        System.out.println(chef);
        assertNotNull(chef);
    }

}