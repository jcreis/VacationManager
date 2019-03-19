package backendspring.vacationmanager;

import backendspring.vacationmanager.model.User;
import backendspring.vacationmanager.model.Vacation;
import backendspring.vacationmanager.repository.UsersRepository;
import backendspring.vacationmanager.repository.VacationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.transaction.Transactional;

@SpringBootApplication
public class VacationManagerApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(VacationManagerApplication.class, args);
    }

    @Autowired
    VacationsRepository vacations;

    @Autowired
    UsersRepository users;

    @Override
    @Transactional
    public void run(String... args) throws Exception {

        System.out.println("Hello");
        User user1 = new User("John Doe", "221212121", "john@mail.com");
        //User user2 = new User("Mary Jane", "919191919191","mary@mail.com");

        Vacation vac1 = new Vacation("Summer vacation", "Vacation on Algarve");

        users.save(user1);
        vacations.save(vac1);
        vac1.addUser(user1);
        user1.setVacation(vac1);




        //vacations.save();

    }
}

