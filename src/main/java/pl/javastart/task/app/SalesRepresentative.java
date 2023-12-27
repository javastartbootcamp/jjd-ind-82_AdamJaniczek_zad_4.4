package pl.javastart.task.app;

import pl.javastart.task.model.Offer;

public class SalesRepresentative {

    private Config config;

    public SalesRepresentative() {
        this.config = new Config();
    }

    public Offer createLoanOffer(int requestedAmount, int earnings) {
        Offer offer = new Offer();
        if (earnings >= config.minRequiredEarnings) {
            offer.setPercentage(config.percentage);
            offer.setValid(true);
            offer.setValue(requestedAmount);
        }
        return offer;
    }
}
