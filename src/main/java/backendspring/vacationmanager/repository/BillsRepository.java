package backendspring.vacationmanager.repository;

import backendspring.vacationmanager.model.Bill;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface BillsRepository extends CrudRepository<Bill, Long> {

    @Query("SELECT b "
            + "FROM Bill b "
            + "WHERE b.id LIKE CONCAT('%',:search,'%') "
            + "OR b.title LIKE CONCAT('%',:search,'%') "
            + "OR b.description LIKE CONCAT('%',:search,'%') "
            + "OR b.price LIKE CONCAT('%',:search,'%') "
    )
    Iterable<Bill> searchBills(@Param(value = "search") String search);
}
