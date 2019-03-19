package backendspring.vacationmanager.controller;

import backendspring.vacationmanager.model.User;
import backendspring.vacationmanager.model.Vacation;
import backendspring.vacationmanager.repository.VacationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController @RequestMapping("/vacations")
public class VacationController {

    @Autowired
    VacationsRepository vacations;


    //                ----------------------- G E T S -----------------------
    @GetMapping("")
    public Iterable<Vacation> getAllVacations(@RequestParam(required = false) String search){

        // Get all the vacations on the system

        System.out.println("this is a get with a list of all vacations on the system");

        if(search == null) {
            return vacations.findAll();
        }
        else{
            return vacations.searchVacations(search);
        }

    }

    @GetMapping("/{id}")
    public Optional<Vacation> getVacationById(@PathVariable("id") long id){

        // Get vacation by {id}
        System.out.println("vacation with id "+ id +" found");
        return vacations.findById(id);
    }


    //                ----------------------- P O S T S -----------------------

    @PostMapping("")
    public void createVacation(@RequestBody Vacation vacation){

        // Create a new vacation in the system
        System.out.println("vacation with title "+ vacation.getTitle() + " created");
        vacations.save(vacation);

    }


    //                ----------------------- P U T S -----------------------

    @PutMapping("/{id}")
    public void updateVacation(@PathVariable("id") long id, @RequestBody Vacation vacation){

        // Update an existent vacation
        if(vacation.getId()==id) {
            Optional<Vacation> old_v = vacations.findById(id);
            if(old_v.isPresent()){
                vacations.save(vacation);
                System.out.println(vacation.getTitle()+" is updated");
            }
            else{
                System.out.println("Not Found.");
            }

        }else{
            System.out.println("Bad Request.");
        }
        return;
    }


    //                ----------------------- D E L E T E S -----------------------


    @DeleteMapping("/{id}")
    public void deleteVacation (@PathVariable("id") long id){

        // Delete vacation identified by {id} from the system
        System.out.println("Vacation with id "+id+" will be deleted.");
        Optional<Vacation> old_v=vacations.findById(id);
        if(old_v.isPresent()){
            vacations.delete(old_v.get());
        }
        else{
            System.out.println("Not Found.");
        }
        return;
    }

    @GetMapping("/{id}/users")
    public List<User> getAllUsers(@PathVariable("id") long id, @RequestParam( required = false ) String search){

        // Get all the users from a vacation identified by {id}
        return null;
    }




    /*

    @GetMapping("/{id}/bills")
    public List<Bill> getAllBills(@PathVariable("id") long id, @RequestParam(required = false) String search){

        // Get all the bills from a vacation identified by {id}
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

    @DeleteMapping("/{id}/bills/{bid}")
    public Vacation deleteBillFromVacation (@PathVariable("id") long id, @PathVariable("bid") long bid){
        return null;
    }

    @DeleteMapping("/{id}/users/{uid}")
    public Vacation deleteUserFromVacation (@PathVariable("id") long id, @PathVariable("uid") long uid){
        return null;
    }
*/

}
