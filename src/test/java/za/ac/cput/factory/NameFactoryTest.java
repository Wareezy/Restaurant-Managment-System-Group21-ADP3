package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Name;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

class NameFactoryTest {

    @Test
    void testCreateNameWithoutMiddleName () {
        Name name = NameFactory.createName("Zelino", "Pestana");
        assertNotNull(name);
        System.out.println(name);
    }

    @Test
    void testCreateName () {
        Name name = NameFactory.createName("Marco", "Sancho", "Pestana");
        assertNotNull(name);
        System.out.println(name);
    }

}