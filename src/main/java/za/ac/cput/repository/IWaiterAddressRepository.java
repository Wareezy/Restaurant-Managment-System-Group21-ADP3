package za.ac.cput.repository;

/**
 * IWaiterAddressRepository.java;
 * @Author: Nawaaz Amien - 219099839
 */

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.domain.WaiterAddress;

import java.util.List;

public interface IWaiterAddressRepository extends JpaRepository<WaiterAddress, String> {
    List<WaiterAddress> findAll();
}
