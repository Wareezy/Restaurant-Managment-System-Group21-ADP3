package za.ac.cput.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;

/*Warren Jaftha-219005303*/

@Entity
@IdClass(Waiter.WaiterIdentity.class)
public class Waiter implements Serializable {
    @NotNull @Id
    @Column(name="waiter_Id")
    private String waiterId;
    @NotNull
    private String waiterEmail;
    @Embedded
    private Name name;

    protected Waiter(){}

    private Waiter(Builder builder)
    {
        this.waiterId=builder.waiterId;
        this.waiterEmail=builder.waiterEmail;
        this.name=builder.name;
    }
    public String getWaiterId(){return waiterId;}
    public String getWaiterEmail(){return waiterEmail;}
    public Name getName(){return name;}


    @Override
    public String toString() {
        return "Waiter{" +
                "waiterId='" + waiterId + '\'' +
                ", waiterEmail='" + waiterEmail + '\'' +
                ", name=" + name +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if(this==o) return true;
        if(o==null || getClass() != o.getClass()) return false;
        Waiter waiter=(Waiter) o;
        return waiterId.equals(waiter.waiterId) && waiterEmail.equals(waiter.waiterEmail) && name.equals(waiter.name);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(waiterId,waiterEmail,name);

    }
    public static class Builder{
        private String waiterId,waiterEmail;
        private Name name;

        public Builder waiterId(String waiterId)
        {
            this.waiterId=waiterId;
            return this;
        }
        public Builder waiterEmail(String waiterEmail)
        {
            this.waiterEmail=waiterEmail;
            return this;
        }

        public Builder name(Name name)
        {
            this.name=name;
            return this;
        }


        public Builder copy(Waiter waiter)
        {
            this.waiterId=waiter.waiterId;
            this.waiterEmail=waiter.waiterEmail;
            this.name=waiter.name;
            return this;
        }
        public Waiter build()
        {
            return new Waiter(this);}}

    public static class WaiterIdentity implements Serializable
    {
        public String waiterId;
        public WaiterIdentity(String waiterId){this.waiterId=waiterId;}
        protected WaiterIdentity(){}
        public String getWaiterId(){return waiterId;}
    }
}


