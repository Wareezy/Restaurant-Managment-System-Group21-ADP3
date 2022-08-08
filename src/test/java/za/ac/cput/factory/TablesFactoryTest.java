package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Tables;

import static org.junit.jupiter.api.Assertions.*;

class TablesFactoryTest {
    @Test
    public void test(){
        Tables tables = TablesFactory.createTables("12", "10" );
        System.out.println(tables.toString());
        assertNotNull(tables);
    }
}