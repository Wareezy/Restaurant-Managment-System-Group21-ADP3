package za.ac.cput.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class
Menu implements Serializable {

    @Id
    @Column(name = "Menu")
    private String menuId;
    private String menuDetails;
    private String title;


    protected Menu() {}

    private Menu (Builder builder){
        this.menuId = builder.menuId;
        this.menuDetails = builder.menuDetails;
        this.title = builder.title;
    }

    public String getMenuId() {return menuId;}
    public String getMenuDetails() {return menuDetails;}
    public String getTitle() {return title;}

    @Override
    public  boolean equals( Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Menu menu = (Menu) o;
        return menuId == menu.menuId && Objects.equals(menuDetails, menu.menuDetails) && Objects.equals(title, menu.title);
    }

    @Override
    public int hashCode(){return Objects.hash(menuId, menuDetails, title);}

    @Override
    public String toString() {
        return "Menu{" +
                "menuId='" + menuId + '\'' +
                ", menuDetails='" + menuDetails + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
    public static class Builder {
        private String menuId;
        private String menuDetails;
        private String title;

        public Builder setMenuId(String menuId){
            this.menuId = menuId;
            return this;
        }
        public Builder setMenuDetails(String menuDetails){
            this.menuDetails = menuDetails;
            return this;
        }
        public Builder setTitle(String title){
            this.title = title;
            return this;
        }
        public Builder copy (Menu menu){
            this.menuId = menu.menuId;
            this.menuDetails = menu.menuDetails;
            this.title = menu.title;
            return this;
        }
        public Menu build(){return (new Menu(this));}
    }

}
