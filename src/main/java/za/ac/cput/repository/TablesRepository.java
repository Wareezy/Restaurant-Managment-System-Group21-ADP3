package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.domain.Tables;

import java.util.List;

public interface TablesRepository extends JpaRepository {
    List<Tables> findAll();
    List<Tables> findByTableId(String tableId);
}
