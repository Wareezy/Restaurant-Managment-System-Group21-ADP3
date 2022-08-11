package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.MenuItem;

import static org.junit.jupiter.api.Assertions.assertNotNull;


class MenuItemFactoryTest {

    @Test
    void PassTest(){
        MenuItem menuItem = MenuItemFactory.createMenu("Adults Menu" );
        assertNotNull(menuItem);
        System.out.println(menuItem);
    }
    @Test
    void FailTest(){
        MenuItem menuItem = MenuItemFactory.createMenu(" " );
        assertNotNull(menuItem);
        System.out.println(menuItem);
    }
}