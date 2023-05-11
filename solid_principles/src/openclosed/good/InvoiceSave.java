package openclosed.good;
import singleresponsibility.good.Invoice;

// by implementing an interface, the actual class is not modified, only extended.
interface InvoiceSave {
    public void save(Invoice invoice);
}

class SaveToDataBase implements InvoiceSave{
    @Override
    public void save(Invoice invoice) {
        // code for saving to DB
    }
}

class SaveToFile implements InvoiceSave{
    @Override
    public void save(Invoice invoice) {
    // code for saving to File
    }
}
