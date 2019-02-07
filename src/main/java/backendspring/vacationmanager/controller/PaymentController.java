package backendspring.vacationmanager.controller;

import backendspring.vacationmanager.model.Payment;
import backendspring.vacationmanager.repository.PaymentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController @RequestMapping("/payments")
public class PaymentController {

    @Autowired
    PaymentsRepository payments;

    //                ----------------------- G E T S -----------------------
    // GET /
    // GET /{id}

    @GetMapping("")
    public Iterable<Payment> getAllPayments(@RequestParam(required = false) String search) {
        if(search == null)
            return payments.findAll();
        else
            return payments.searchPayments(search);
    }

    @GetMapping("/{id}")
    public Optional<Payment> getPaymentById(@PathVariable("id") long id) {
        return payments.findById(id);
    }






    //                ----------------------- P O S T S -----------------------
    // POST /

    @PostMapping("")
    public void addPayment(@RequestBody Payment payment){
        payments.save(payment);
    }






    //                ----------------------- P U T S -----------------------
    // PUT /{id}

    @PutMapping("/{id}")
    public void updatePayment(@PathVariable("id") long id, @RequestBody Payment payment){
        if(payment.getId() == id){
            Optional<Payment> old_p = payments.findById(id);
            if(old_p.isPresent()){
                payments.save(payment);
            }
            else{
                System.out.println("Not found.");
            }
        }
        else{
            System.out.println("Bad Request Exception *Here*");
        }
    }






    //                ----------------------- D E L E T E S -----------------------
    // DELETE /{id}


    @DeleteMapping("/{id}")
    public void deletePaymentById(@PathVariable("id")long id){
        Optional<Payment> old_p = payments.findById(id);
        if(old_p.isPresent()){
            payments.delete(old_p.get());
        }
        else{
            System.out.println("Not found.");
        }
    }


}
