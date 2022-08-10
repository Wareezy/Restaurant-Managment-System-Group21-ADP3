package za.ac.cput.factory;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Customer;
import za.ac.cput.domain.Waiter;

import static org.junit.jupiter.api.Assertions.*;
/*Warren Jaftha-219005303*/
class WaiterFactoryTest {
    @Test
    void test()
    {
        Waiter waiter=WaiterFactory.createWaiter("test-id","warrenjaftha16@gmail.com","Warren","middle-name","Jaftha");
        assertNotNull(waiter);
        System.out.println(waiter);
    }
    @Test
    void buildWithError()
    {
        Exception exception=assertThrows(IllegalArgumentException.class,()->WaiterFactory.createWaiter(null,"warrenjaftha16@gmail.com","Warren","middle-name","Jaftha"));
        String exceptionMessage=exception.getMessage();
        System.out.println(exceptionMessage);
        assertSame("waiter id is required",exceptionMessage);
    }
}