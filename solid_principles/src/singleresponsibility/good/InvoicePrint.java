package singleresponsibility.good;
// responsibility of this class is to only print the invoice.

public class InvoicePrint {
    private Invoice invoice;
    public InvoicePrint(Invoice invoice){
        this.invoice = invoice;
    }
    public void print(){
        System.out.println(this.invoice);
    }
}