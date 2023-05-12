package openclosed.good;
import singleresponsibility.good.Invoice;

// by implementing an interface, the actual class is not modified, only extended.
interface InvoiceSave {
    public void save(Invoice invoice);
}

