package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Menu;

import static org.junit.jupiter.api.Assertions.*;

class MenuFactoryTest {

    @Test
    void passTest(){
        Menu menu = MenuFactory.createMenu("M1", "Kiddies", "This is Kiddies Menu");
        assertNotNull(menu);
        System.out.println(menu);
    }
    @Test
    void failTest(){
        Menu menu = MenuFactory.createMenu(" ", "Kiddies", "This is Kiddies Menu");
        assertNotNull(menu);
        System.out.println(menu);
    }
}