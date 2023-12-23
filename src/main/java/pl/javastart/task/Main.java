package pl.javastart.task;

import pl.javastart.task.service.Offer;
import pl.javastart.task.service.SalesRepresentative;
import pl.javastart.task.service.CustomerService;

public class Main {
    public static void main(String[] args) {
        SalesRepresentative salesRepresentative = new SalesRepresentative();
        Offer offer = salesRepresentative.createLoanOffer(1_000_000, 1000);
        CustomerService customerService = new CustomerService();
        customerService.payoutOffer(offer);
    }
}