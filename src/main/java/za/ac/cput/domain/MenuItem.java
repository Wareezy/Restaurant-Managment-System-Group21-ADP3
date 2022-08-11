package za.ac.cput.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MenuItem {
    @Id
    @Column(name = "Menu_Item")

    private String title;
    private Order order;


    protected MenuItem(){}

    private MenuItem (Builder builder){
        this.title = builder.title;
        this.order = builder.order;
    }
    public String getTitle (){return title;}
    public Order getOrder(){return order;}

    @Override
    public String toString() {
        return "MenuItem{" +
                "title='" + title + '\'' +
                ", order=" + order +
                '}';
    }
    public static class Builder{
        private String title;
        private Order order;

        public Builder setTitle(String title){
            this.title = title;
            return this;
        }
        public  Builder setOrder(Order order){
            this.order = order;
            return this;
        }
        public Builder copy(MenuItem menuItem){
            this.title = menuItem.title;
            this.order = menuItem.getOrder();
            return this;
        }
        public MenuItem build(){return (new MenuItem(this));}
    }

}
