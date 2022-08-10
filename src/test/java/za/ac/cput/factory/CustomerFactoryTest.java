package za.ac.cput.factory;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Customer;

import static org.junit.jupiter.api.Assertions.*;
/*Warren Jaftha-219005303*/
class CustomerFactoryTest {
    @Test
    void test()
    {
        Customer customer=CustomerFactory.createCustomer("test-id","warrenjaftha16@gmail.com","Warren","middle-name","Jaftha");
        assertNotNull(customer);
        System.out.println(customer);
    }
    @Test
    void buildWithError()
    {
        Exception exception=assertThrows(IllegalArgumentException.class,()->CustomerFactory.createCustomer(null,"warrenjaftha16@gmail.com","Warren","middle-name","lastName"));
        String exceptionMessage=exception.getMessage();
        System.out.println(exceptionMessage);
        assertSame("customer Id is required",exceptionMessage);

    }
}