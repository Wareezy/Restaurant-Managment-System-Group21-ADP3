package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Customer;
import za.ac.cput.domain.Name;

import java.util.List;
/*Warren Jaftha-219005303*/
@Repository
public interface CustomerRepository extends JpaRepository<Customer,String> {
    public Customer findByName(Name name);

    List<Customer>findByCustomerId(String customerId);
}
