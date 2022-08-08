package za.ac.cput.domain;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@Embeddable
public class Tables implements Serializable {

    private String tableID;

    private String numberOfGuest;

    @Embedded
    private Order order;
    public Order getOrder() {
        return order;
    }

    //private constructor
    protected Tables(){}

    private Tables (Builder builder){
        this.tableID = builder.tableID;
        this.numberOfGuest = builder.numberOfGuest;
    }

    public String getTableID() {
        return tableID;
    }
    public String getNumberOfGuest(){return numberOfGuest;}

    @Override
    public String toString() {
        return "Tables{" +
                "tableID=" + tableID +
                ", numberOfGuest=" + numberOfGuest +
                '}';
    }
    public static class Builder{
        private String tableID;
        private String numberOfGuest;

        public Builder setTableID(String tableID) {
            this.tableID = tableID;
            return this;
        }

        public Builder setNumberOfGuest(String numberOfGuest) {
            this.numberOfGuest= numberOfGuest;
            return this;
        }


        public Builder copy(Tables tables){
            this.tableID = tables.tableID;
            this.numberOfGuest = tables.numberOfGuest;
            return this;
        }
        public Tables build(){
            return new Tables(this);
        }
    }
}

