package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface ItemRepo extends JpaRepository<Item,String> {

    @Query(value = "select code from item", nativeQuery = true)
    List<String> getAllItemIds();

}
