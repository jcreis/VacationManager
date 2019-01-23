package backendspring.vacationmanager.controller;

import backendspring.vacationmanager.model.Bill;
import backendspring.vacationmanager.model.User;
import backendspring.vacationmanager.model.Vacation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController @RequestMapping("/vacations")
public class VacationController {

    @GetMapping("")
    public List<Vacation> getAllVacations(@RequestParam(required = false) String search){

        // Get all the vacations on the system
        return null;
    }

    @GetMapping("/{id}")
    public Vacation getVacationById(@PathVariable("id") long id){

        // Get vacation by {id}
        return null;
    }

    @GetMapping("/{id}/users")
    public List<User> getAllUsers(@PathVariable("id") long id, @RequestParam( required = false ) String search){

        // Get all the users from a vacation identified by {id}
        return null;
    }

    @GetMapping("/{id}/bills")
    public List<Bill> getAllBills(@PathVariable("id") long id, @RequestParam(required = false) String search){

        // Get all the bills from a vacation identified by {id}
        return null;
    }

    @PostMapping("")
    public Vacation createVacation(@RequestBody Vacation vacation){

        // Create a new vacation in the system
        return null;
    }

    @PostMapping("/{id}/users")
    public Vacation addUserToVacation(@PathVariable("id") long id, @RequestBody User user){

        // Add a new user in the vacation identified by {id}
        return null;
    }

    @PostMapping("/{id}/bills")
    public Vacation addBillToVacation(@PathVariable("id") long id, @RequestBody Bill bill){

        // Add a new bill in the vacation identified by {id}
        return null;
    }

    @PutMapping("/{id}")
    public Vacation updateVacation(@PathVariable("id") long id, @RequestBody Vacation vacation){

        // Update an existent vacation
        return null;
    }

    @PutMapping("/{id}/users/{uid}")
    public Vacation updateUserFromVacation (@PathVariable("id") long id, @PathVariable("uid") long uid,
                                   @RequestBody Vacation vacation){

        // Update (remove or simply edit) an existent user present in an existent vacation {id}
        return null;
    }

    @PutMapping("/{id}/bills/{bid}")
    public Vacation updateBillFromVacation (@PathVariable("id") long id, @PathVariable("bid") long bid,
                                @RequestBody Vacation vacation){

        // Update (remove or simply edit) an existent bill present in an existent vacation {id}
        return null;
    }

    @DeleteMapping("")
    public void deleteAllVacations (){

        // Delete all vacations from the system

    }

    @DeleteMapping("/{id}")
    public Vacation deleteVacation (@PathVariable("id") long id){

        // Delete vacation identified by {id} from the system
        return null;
    }

    @DeleteMapping("/{id}/bills/{bid}")
    public Vacation deleteBillFromVacation (@PathVariable("id") long id, @PathVariable("bid") long bid){
        return null;
    }

    @DeleteMapping("/{id}/users/{uid}")
    public Vacation deleteUserFromVacation (@PathVariable("id") long id, @PathVariable("uid") long uid){
        return null;
    }

}
