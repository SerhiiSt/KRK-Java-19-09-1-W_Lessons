package pl.itacademy.lesson5;


import java.util.Date;

public abstract class PublicTransport extends Transport {

       private boolean hasTicketsMachine;
       private Date dateOfLastReview;

    public PublicTransport(String name, String model, int speed) {
        super(name, model, speed);
    }


    public boolean isHasTicketsMachine() {
        return hasTicketsMachine;
    }

    public void setHasTicketsMachine(boolean hasTicketsMachine) {
        this.hasTicketsMachine = hasTicketsMachine;
    }

    public Date getDateOfLastReview() {
        return dateOfLastReview;
    }

    public void setDateOfLastReview(Date dateOfLastReview) {
        this.dateOfLastReview = dateOfLastReview;
    }
}
