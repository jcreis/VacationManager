package backendspring.vacationmanager.controller;

import backendspring.vacationmanager.model.Payment;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController @RequestMapping("/payments")
public class PaymentController {

    // GET /
    // GET /{id}

    @GetMapping("")
    public List<Payment> getAllPayments(@RequestParam(required = false) String search) {
        return null;
    }

    @GetMapping("/{id}")
    public List<Payment> getPaymentById(@PathVariable("id") long id) {
        return null;
    }


    // POST /

    @PostMapping("")
    public Payment addPayment(@RequestBody Payment payment){
        return null;
    }


    // PUT /{id}

    @PutMapping("/id")
    public Payment updatePayment(@PathVariable("id") long id, @RequestBody Payment payment){
        return null;
    }


    // DELETE /
    // DELETE /{id}

    @DeleteMapping("")
    public void deleteAllPayments(){

    }

    @DeleteMapping("/{id}")
    public void deletePaymentById(@PathVariable("id")long id){

    }


}
