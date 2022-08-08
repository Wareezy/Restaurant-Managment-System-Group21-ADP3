package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.ChefAddress;

import javax.persistence.Id;
import java.util.List;
@Repository
public interface ChefAddressRepository  extends JpaRepository<ChefAddress,ChefAddress.chefAddressId> {
    public List<ChefAddress> findAll();

}
