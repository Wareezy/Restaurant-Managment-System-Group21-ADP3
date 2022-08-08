package za.ac.cput.factory;


import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Order;


import static org.junit.jupiter.api.Assertions.*;

class OrderFactoryTest {

    @Test
    void testCreateOrder (){
        Order order = OrderFactory.createOrder("ORD124", "Burger and chips",
                "CUS246", "WAIT567", "CHEF345");
        assertNotNull(order);
        System.out.println(order);
    }


}