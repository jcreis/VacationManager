package backendspring.vacationmanager.repository;


import backendspring.vacationmanager.model.Payment;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface PaymentsRepository extends CrudRepository<Payment, Long> {

    @Query("SELECT p "
            + "FROM Payment p "
            + "WHERE p.id LIKE CONCAT('%',:search,'%') "
            + "OR p.total LIKE CONCAT('%',:search,'%') "
    )
    Iterable<Payment> searchPayments(@Param(value = "search") String search);
}
