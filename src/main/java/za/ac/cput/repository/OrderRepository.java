package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Order;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository <Order, String> {
    public List<Order> findAll();
    public List<Order> findByOrderId(String orderId);
}
