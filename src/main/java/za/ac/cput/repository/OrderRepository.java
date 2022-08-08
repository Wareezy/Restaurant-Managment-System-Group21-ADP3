package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.domain.Order;

import java.util.List;

public interface OrderRepository extends JpaRepository <Order, String> {

    public List<Order> findAllByOrder_Order_Id (String orderId);
}
