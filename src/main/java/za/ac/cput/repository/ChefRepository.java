package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Chef;

import javax.persistence.Id;
import java.util.List;
@Repository
public interface ChefRepository extends JpaRepository<Chef, Id> {
    public List<Chef> findAll();
    public List<Chef> findById(String Id);
}
