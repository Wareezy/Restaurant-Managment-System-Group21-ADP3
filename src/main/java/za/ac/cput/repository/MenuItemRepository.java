package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.domain.Menu;
import za.ac.cput.domain.MenuItem;

import java.util.List;

public interface MenuItemRepository extends JpaRepository<MenuItem,String> {

    public Menu findByTitle(MenuItem title);

    List<MenuItem> findByTitle(String title);
}
