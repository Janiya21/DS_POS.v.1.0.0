package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Customer;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CustomerRepo extends JpaRepository<Customer, String> {

    @Query(value = "select id from Customer", nativeQuery = true)
    List<String> getAllCustomerIds();

}
