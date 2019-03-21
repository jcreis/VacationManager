package backendspring.vacationmanager;

import backendspring.vacationmanager.model.Bill;
import backendspring.vacationmanager.model.User;
import backendspring.vacationmanager.model.Vacation;
import backendspring.vacationmanager.repository.BillsRepository;
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

    @Autowired
    BillsRepository bills;

    @Override
    @Transactional
    public void run(String... args) throws Exception {

        User user1 = new User("John Doe", "221212121", "john@mail.com");
        User user2 = new User("Mary Jane", "919191919191","mary@mail.com");

        Bill bill1 = new Bill("Compras 1", "Pingo doce", 232.23 );
        Bill bill2 = new Bill("Compras 2", "Bebidas dia 1", 56.50 );

        Vacation vac1 = new Vacation("Summer vacation", "Vacation on Algarve");
        Vacation vac2 = new Vacation("Winter vacation", "Vacation on Serra da Estrela");

        users.save(user1);
        users.save(user2);

        vacations.save(vac1);
        vacations.save(vac2);

        bills.save(bill1);
        bills.save(bill2);

        vac1.addUser(user1);
        vac1.addUser(user2);

        user1.setVacation(vac1);
        user2.setVacation(vac1);

        bill1.setVacation(vac1);
        bill2.setVacation(vac1);

        bill1.addPayer(user1);
        bill1.addDebtor(user2);
        bill1.addDebtor(user1);
        bill2.addDebtor(user1);

    }
}

