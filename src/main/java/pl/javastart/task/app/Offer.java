package pl.javastart.task.app;

public class Offer {

    private boolean valid;
    private double value;
    private double percentage;

    public Offer() {

    }

    boolean isValid() {
        return valid;
    }

    void setValid(boolean valid) {
        this.valid = valid;
    }

    double getValue() {
        return value;
    }

    void setValue(double value) {
        this.value = value;
    }

    double getPercentage() {
        return percentage;
    }

    void setPercentage(double percentage) {
        this.percentage = percentage;
    }
}
