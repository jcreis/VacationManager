package backendspring.vacationmanager.controller;

import backendspring.vacationmanager.model.Bill;
import backendspring.vacationmanager.repository.BillsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController @RequestMapping("/bills")
public class BillController {

    @Autowired
    BillsRepository bills;

    //                ----------------------- G E T S -----------------------
    // GET /
    // GET /{id}
    // GET /{id}/users
    // GET /{id}/users/{uid}
    // GET /{id}/debtors
    // GET /{id}/payers

    @GetMapping("")
    public Iterable<Bill> getAllBills(@RequestParam (required = false) String search){
        if(search == null){
            return bills.findAll();
        }
        else{
            return bills.searchBills(search);
        }
    }


    @GetMapping("/{id}")
    public Optional<Bill> getBillById(@PathVariable ("id") long id){
        return bills.findById(id);
    }


    //                ----------------------- P O S T S -----------------------
    // POST /
    // POST /{id}/users
    // POST /{id}/payers
    // POST /{id}/debtors

    @PostMapping("")
    public void addBill(@RequestBody Bill bill){
        bills.save(bill);
    }

    //                ----------------------- P U T S -----------------------

    // PUT /{id}
    // PUT /{id}/users/{uid}
    // PUT /{id}/debtors/{did}
    // PUT /{id}/payers/{pid}

    @PutMapping("/{id}")
    public void updateBill(@PathVariable("id") long id, @RequestBody Bill bill){
        if(bill.getId() == id){
            Optional<Bill> old_b = bills.findById(id);
            if(old_b.isPresent()){
                bills.save(bill);
            }
            else{
                System.out.println("Not found.");
            }
        }
        else{
            System.out.println("Bad Request.");
        }
        return;
    }


    //                ----------------------- D E L E T E S -----------------------
    // DELETE /{id}
    // DELETE /{id}/users/{uid}
    // DELETE /{id}/payers/{pid}
    // DELETE /{id}/debtors/{did}

    @DeleteMapping("/{id}")
    public void deleteBillById(@PathVariable("id") long id){
        Optional<Bill> old_b = bills.findById(id);
        if(old_b.isPresent()){
            bills.delete(old_b.get());
        }
        else{
            System.out.println("Not found.");
        }
    }





    /*@GetMapping("/{id}/users")
    public List<User> getAllUsers(@PathVariable ("id") long id){
        return null;
    }


    @GetMapping("/{id}/users/{uid}")
    public User getUserById(@PathVariable("id") long id, @PathVariable("uid") long uid){
        return null;
    }


    @GetMapping("/{id}/debtors")
    public List<User> getAllDebtors(@PathVariable("id") long id){
        return null;
    }


    @GetMapping("/{id}/payers")
    public List<User> getAllPayers(@PathVariable("id") long id){
        return null;
    }








    @PostMapping("/{id}/users")
    public Bill addUserToBill(@PathVariable("id") long id, @RequestBody User user){
        return null;
    }

    @PostMapping("/{id}/debtors")
    public Bill addDebtorToBill(@PathVariable("id") long id, @RequestBody User debtor){
        return null;
    }

    @PostMapping("/{id}/payers")
    public Bill addPayerToBill(@PathVariable("id") long id, @RequestBody User payer){
        return null;
    }









    @PutMapping("/{id}/users/{uid}")
    public Bill updateUserFromBill(@PathVariable("id") long id, @PathVariable("uid") long uid,
                                   @RequestBody User user){
        return null;
    }

    @PutMapping("/{id}/debtors/{did}")
    public Bill updateDebtorFromBill(@PathVariable("id") long id, @PathVariable("did") long did,
                                    @RequestBody User debtor){
        return null;
    }

    @PutMapping("/{id}/payers/{pid}")
    public Bill updatePayerFromBill(@PathVariable("id") long id, @PathVariable("pid") long pid,
                                    @RequestBody Bill bill){
        return null;
    }












    @DeleteMapping("/{id}/users/{uid}")
    public Bill deleteUserFromBill(@PathVariable("id") long id, @PathVariable("uid") long uid){
        return null;
    }

    @DeleteMapping("/{id}/debtors/{did}")
    public Bill deleteDebtorFromBill(@PathVariable("id") long id, @PathVariable("did") long did){
        return null;
    }

    @DeleteMapping("/{id}/payers/{pid}")
    public Bill deletePayerFromBill(@PathVariable("id") long id, @PathVariable("pid") long pid){
        return null;
    }
*/
}
