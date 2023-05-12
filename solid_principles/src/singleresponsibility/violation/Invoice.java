package singleresponsibility.violation;
import singleresponsibility.good.Marker;
// responsibility of this class is to total, print and save the invoice.
public class Invoice {
    private Marker marker;
    private int quantity;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public void calculateTotal(){
        int price = ((marker.price) * this.quantity);
    }

    public void save(){
        // save to file or database
    }

    public void print(){
        // print
    }

}
