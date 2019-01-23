package backendspring.vacationmanager.repository;

import backendspring.vacationmanager.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UsersRepository extends CrudRepository<User, Long> {

    @Query("SELECT u "
            + "FROM User u "
            + "WHERE u.id LIKE CONCAT('%',:search,'%') "
            + "OR u.title LIKE CONCAT('%',:search,'%') "
            + "OR u.text LIKE CONCAT('%',:search,'%') "
            + "OR u.creationDate LIKE CONCAT('%',:search,'%') "
    )
    Iterable<User> searchUsers(@Param(value = "search") String search);
}