package za.ac.cput.domain;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@Embeddable
public class Payment implements Serializable {
    private String cardNumber;
    private String paymentAmount;

    @Embedded
    private Order order;
    public Order getOrder() {
        return order;
    }
    protected Payment(){}

    private Payment (Builder builder){
        this.cardNumber = builder.cardNumber;
        this.paymentAmount = builder.paymentAmount;
    }

    public String getCardNumber() {
        return cardNumber;
    }
    public String getPaymentAmount(){return paymentAmount;}

    @Override
    public String toString() {
        return "Payment{" +
                "cardNumber=" + cardNumber +
                ", payAmount=" + paymentAmount +
                '}';
    }

    public static class Builder{
        private String cardNumber;
        private String paymentAmount;

        public Payment.Builder setCardNumber(String cardNumber) {
            this.cardNumber = cardNumber;
            return this;
        }

        public Payment.Builder setPayAmount(String paymentAmount) {
            this.paymentAmount= paymentAmount;
            return this;
        }

        public Payment.Builder copy(Payment payment){
            this.cardNumber = payment.cardNumber;
            this.paymentAmount = payment.paymentAmount;
            return this;
        }
        public Payment build(){
            return new Payment(this);
        }
    }
}
