package pl.javastart.task;

import pl.javastart.task.app.SalesRepresentative;
import pl.javastart.task.app.CustomerService;
import pl.javastart.task.app.Offer;

public class Main {
    public static void main(String[] args) {
        SalesRepresentative salesRepresentative = new SalesRepresentative();
        Offer offer = salesRepresentative.createLoanOffer(1_000_000, 10_000);
        CustomerService customerService = new CustomerService();
        customerService.payoutOffer(offer);
    }
}