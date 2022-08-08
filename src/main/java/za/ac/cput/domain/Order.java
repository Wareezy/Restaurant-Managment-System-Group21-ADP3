package za.ac.cput.domain;

import org.apache.maven.model.Build;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Order implements Serializable {

    @Id
    @Column(name = "orderId")
    private String orderId;

    private String orderDetails;

    @Id
    @Column(name = "customerId")
    private String customerId;

    @Id
    @Column(name = "waiterId")
    private String waiterId;

    @Id
    @Column(name = "chefId")
    private String chefId;



    @OneToOne
    @JoinColumn(name = "customer_Id", referencedColumnName = "customer_Id")
    private Customer customer;


    @OneToOne
    @JoinColumn(name = "waiter_Id", referencedColumnName = "waiter_Id")
    private Waiter waiter;


    @OneToOne
    @JoinColumn(name = "chef_Id", referencedColumnName = "chef_Id")
    private Chef chef;


//    @ManyToOne(cascade = CascadeType.ALL)


    protected Order () {}

    private Order (Builder builder){
        this.orderId = builder.orderId;
        this.customerId = builder.customerId;
        this.orderDetails = builder.orderDetails;
        this.waiterId = builder.waiterId;
        this.chefId = builder.chefId;

    }
    public String getOrderId() {
        return orderId;
    }

    public String getOrderDetails() {
        return orderDetails;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getWaiterId() {
        return waiterId;
    }

    public String getChefId() {
        return chefId;
    }

    private void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    private void setOrderDetails(String orderDetails) {
        this.orderDetails = orderDetails;
    }

    private void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    private void setWaiterId(String waiterId) {
        this.waiterId = waiterId;
    }

    private void setChefId(String chefId) {
        this.chefId = chefId;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if(o==null || getClass()!=o.getClass()) return false;
        Order order=(Order) o;
        return Objects.equals(orderId, order.orderId) && Objects.equals(orderDetails, order.orderDetails)
                && Objects.equals(customerId, order.customerId) && Objects.equals(waiterId, order.waiterId)
                && Objects.equals(chefId, order.chefId);
    }

    @Override
    public int hashCode(){return Objects.hash(orderId, orderDetails, customerId, waiterId, chefId);}

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", orderDetails='" + orderDetails + '\'' +
                ", customerId='" + customerId + '\'' +
                ", waiterId='" + waiterId + '\'' +
                ", chefId='" + chefId + '\'' +
                '}';
    }

    public static class Builder  {
        private String orderId;
        private String orderDetails;
        private String customerId;
        private String waiterId;
        private String chefId;

        public Builder setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        public Builder setOrderDetails(String orderDetails) {
            this.orderDetails = orderDetails;
            return this;
        }

        public Builder setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }

        public Builder setWaiterId(String waiterId) {
            this.waiterId = waiterId;
            return this;
        }

        public Builder setChefId(String chefId) {
            this.chefId = chefId;
            return this;
        }

        public Builder copy(Order order){
            this.orderId = order.orderId;
            this.customerId = order.customerId;
            this.orderDetails = order.orderDetails;
            this.waiterId = order.waiterId;
            this.chefId = order.chefId;
            return this;
        }

        public Order build() {return new Order (this);}

    }

}
