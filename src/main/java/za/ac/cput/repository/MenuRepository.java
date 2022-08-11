package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.domain.Menu;

import java.util.List;

public interface MenuRepository extends JpaRepository<Menu,String> {

    public Menu findById(Menu id);

    List<Menu>findByMenuId(String menuId);

}
