package backendspring.vacationmanager.controller;

import backendspring.vacationmanager.model.Payment;
import backendspring.vacationmanager.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController @RequestMapping("/users")
public class UserController {

    // GET /
    // GET /{id}
    // GET /{id}/debts
    // GET /{id}/toreceive

    @GetMapping("")
    public List<User> getAllUsers(@RequestParam (required = false) String search){
        return null;
    }


    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") long id){
        return null;
    }

    @GetMapping("/{id}/debts")
    public List<Payment> getDebtsFromUser(@PathVariable("id") long id){
        return null;
    }

    @GetMapping("/{id}/toreceive")
    public List<Payment> getMoneyToReceiveFromUser(@PathVariable("id") long id){
        return null;
    }


    // POST /
    // POST /{id}/debts
    // POST /{id}/toreceive

    @PostMapping("")
    public User addUser(@RequestBody User user){
        return null;
    }

    @PostMapping("/{id}/debts")
    public User addDebtToUser(@PathVariable("id") long id, @RequestBody Payment debt){
        return null;
    }

    @PostMapping("/{id}/toreceive")
    public User addMoneyToReceiveToUser(@PathVariable("id") long id, @RequestBody Payment toReceive){
        return null;
    }


    // PUT /{id}
    // PUT /{id}/debts/{did}
    // PUT /{id}/toreceive/{trid}

    @PutMapping("/{id}")
    public User updateUser(@PathVariable("id") long id, @RequestBody User user){
        return null;
    }

    @PutMapping("/{id}/debts/{did}")
    public User updateDebtFromUser(@PathVariable("id") long id, @RequestBody Payment debt){
        return null;
    }

    @PutMapping("/{id}/toreceive/{trid}")
    public User updateMoneyToReceiveFromUser(@PathVariable("id") long id, @RequestBody Payment toReceive){
        return null;
    }


    // DELETE /
    // DELETE /{id}
    // DELETE /{id}/debts/{did}
    // DELETE /{id}/toreceive/{trid}

    @DeleteMapping("")
    public void deleteAllUsers(){

    }

    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable("id") long id){

    }

    @DeleteMapping("/{id}/debts/{did}")
    public User deleteDebtFromUser(@PathVariable("id") long id, @PathVariable("did") long did){
        return null;
    }

    @DeleteMapping("/{id}/toreceive/{trid}")
    public User deleteUserById(@PathVariable("id") long id, @PathVariable("trid") long trid){
        return null;
    }

}
