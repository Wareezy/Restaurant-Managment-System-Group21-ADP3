package za.ac.cput.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.lang.module.ModuleDescriptor;
import java.util.Objects;
/*Warren Jaftha-219005303*/
@Entity
@IdClass(Customer.CustomerIdentity.class)
public class Customer implements Serializable {
    @NotNull
    @Id
    @Column(name="customer_Id")
    private String customerId;
    @NotNull
    private String customerEmail;
    @Embedded
    private Name name;

    protected Customer(){}
    private Customer(Builder builder)
    {
        this.customerId=builder.customerId;

        this.customerEmail=builder.customerEmail;
        this.name=builder.name;

    }

    public String getCustomerId(){return customerId;}

    public String getCustomerEmail(){return customerEmail;}
    public Name getName(){return name;}


    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", name=" + name +
                '}';
    }

    @Override
    public boolean equals(Object o){
        if(this==o) return true;
        if(o== null || getClass() !=o.getClass()) return false;
        Customer customer=(Customer) o;
        return customerId.equals(customer.customerId)  && customerEmail.equals(customer.customerEmail) && name.equals(customer.name);

    }
    @Override
    public int hashCode(){
        return Objects.hash(customerId,customerEmail,name);
    }
    public static class Builder{
        private String customerId,customerEmail;
        private Name name;

        public Builder customerId(String customerId)
        {
            this.customerId=customerId;
            return this;
        }

        public Builder customerEmail(String customerEmail){
            this.customerEmail=customerEmail;
            return this;
        }
        public Builder name(Name name)
        {
            this.name=name;
            return this;
        }

        public Builder copy(Customer customer) {
            this.customerId = customer.customerId;
            this.name=customer.name;
            this.customerEmail=customer.customerEmail;

            return this;

        }
        public Customer build()
        {
            return new Customer(this);
        }}

    public static class CustomerIdentity implements Serializable
    {
        public String customerId;
        public CustomerIdentity(String customerId){this.customerId=customerId;}
        protected CustomerIdentity(){}
        public String getCustomerId(){return customerId;}
    }
}

