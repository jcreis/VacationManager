package backendspring.vacationmanager.controller;

import backendspring.vacationmanager.model.Bill;
import backendspring.vacationmanager.model.User;
import backendspring.vacationmanager.model.Vacation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController @RequestMapping("/vacations")
public class VacationsController {

    @GetMapping("")
    public List<Vacation> getVacations(@RequestParam(required = false) String search){

        // Get all the vacations on the system

    }

    @GetMapping("/{id}")
    public Vacation getVacationById(@PathVariable("id") long id){

        // Get vacation by {id}

    }

    @GetMapping("/{id}/users")
    public List<User> getUsers(@PathVariable("id") long id, @RequestParam( required = false ) String search){

        // Get all the users from a vacation identified by {id}

    }

    @GetMapping("/{id}/bills")
    public List<Bill> getBills(@PathVariable("id") long id, @RequestParam(required = false) String search){

        // Get all the bills from a vacation identified by {id}

    }

    @PostMapping("")
    public Vacation createVacation(@RequestBody Vacation vacation){

        // Create a new vacation in the system

    }

    @PostMapping("/{id}/users")
    public Vacation addUser(@PathVariable("id") long id, @RequestBody User user){

        // Add a new user in the vacation identified by {id}

    }

    @PostMapping("/{id}/bills")
    public Vacation addBill(@PathVariable("id") long id, @RequestBody Bill bill){

        // Add a new bill in the vacation identified by {id}

    }

    @PutMapping("/{id}")
    public Vacation updateVacation(@PathVariable("id") long id, @RequestBody Vacation vacation){

        // Update an existent vacation

    }

    @PutMapping("/{id}/users/{uid}")
    public Vacation updateUser (@PathVariable("id") long id, @PathVariable("uid") long uid,
                                   @RequestBody Vacation vacation){

        // Update (remove or simply edit) an existent user present in an existent vacation {id}

    }

    @PutMapping("/{id}/bills/{bid}")
    public Vacation updateUser (@PathVariable("id") long id, @PathVariable("bid") long bid,
                                @RequestBody Vacation vacation){

        // Update (remove or simply edit) an existent bill present in an existent vacation {id}

    }

    @DeleteMapping("/{id}")
    public Vacation deleteVacation (@PathVariable("id") long id){

        // Delete vacation identified by {id} from the system

    }

}
