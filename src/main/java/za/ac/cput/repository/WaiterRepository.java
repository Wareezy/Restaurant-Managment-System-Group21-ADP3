package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Name;
import za.ac.cput.domain.Waiter;

import java.util.List;

/*Warren Jaftha-219005303*/
@Repository
public interface WaiterRepository extends JpaRepository<Waiter,String> {
    public Waiter findByName(Name name);

    List<Waiter> findByWaiterId(String waiterId);
}
