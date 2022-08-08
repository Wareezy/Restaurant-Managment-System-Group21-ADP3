package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Payment;

import static org.junit.jupiter.api.Assertions.*;

class PaymentFactoryTest {
    @Test
    public void test(){
        Payment payment = PaymentFactory.createPayment("12", "10" );
        System.out.println(payment.toString());
        assertNotNull(payment);
    }
}