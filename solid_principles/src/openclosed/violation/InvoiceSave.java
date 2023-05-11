package openclosed.violation;

import singleresponsibility.good.Invoice;

public class InvoiceSave {
    Invoice invoice;

    public InvoiceSave(Invoice invoice) {
        this.invoice = invoice;
    }

    public void save(){
        // save to database
    }
    public void saveToFile(){
        // save to file
    }
}
