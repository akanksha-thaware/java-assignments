package singleresponsibility.good;
// responsibility of this class is to only save the invoice.

public class InvoiceSave {
    Invoice invoice;

    public InvoiceSave(Invoice invoice) {
        this.invoice = invoice;
    }

    public void save(){
        // save to file or database
    }
}
