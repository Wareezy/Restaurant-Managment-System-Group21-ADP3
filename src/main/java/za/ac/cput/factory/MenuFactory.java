package za.ac.cput.factory;

import za.ac.cput.domain.Menu;

public class MenuFactory {

    public static Menu createMenu(String menuId, String menuDetails, String title){
        if( StringHelper.isStringHelper.isNullorEmpty(menuId))
            throw new IllegalArgumentException();
        return new Menu.Builder().setMenuId(menuId).setMenuDetails(menuDetails).setTitle(title).build();
    }
}
