package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.domain.Payment;


import java.util.List;

public interface PaymentRepository extends JpaRepository {
    List<Payment> findAll();
    List<Payment> findByCardNumber(String cardNumber);
}
