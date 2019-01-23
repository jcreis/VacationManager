package backendspring.vacationmanager.repository;

import backendspring.vacationmanager.model.Vacation;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface VacationsRepository extends CrudRepository<Vacation, Long> {

    @Query("SELECT v "
            + "FROM Vacation v "
            + "WHERE v.id LIKE CONCAT('%',:search,'%') "
            + "OR v.title LIKE CONCAT('%',:search,'%') "
            + "OR v.text LIKE CONCAT('%',:search,'%') "
            + "OR v.creationDate LIKE CONCAT('%',:search,'%') "
    )
    Iterable<Vacation> searchVacations(@Param(value = "search") String search);
}

