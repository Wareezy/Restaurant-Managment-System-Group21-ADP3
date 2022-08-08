package za.ac.cput.factory;

import org.hibernate.validator.internal.util.StringHelper;
import za.ac.cput.domain.Payment;


public class PaymentFactory {
    public static Payment createPayment(String cardNumber, String paymentAmount){
        if(StringHelper.isNullOrEmptyString(cardNumber) || StringHelper.isNullOrEmptyString(paymentAmount))
            throw new IllegalArgumentException();
        return new Payment.Builder().setCardNumber(cardNumber)
                .setPayAmount(paymentAmount)
                .build();
    }
}
