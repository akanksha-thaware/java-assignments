package dependencyinversion.good;
import singleresponsibility.good.Marker;
import singleresponsibility.good.Invoice;

interface InvoiceRepository {
    void save(Invoice invoice);
}

class DatabaseInvoiceRepository implements InvoiceRepository {

    @Override
    public void save(Invoice invoice) {
        // list of invoices in db
    }
}

class FileInvoiceRepository implements InvoiceRepository {
    private String filename;

    public FileInvoiceRepository(String filename) {
        this.filename = filename;
    }

    @Override
    public void save(Invoice invoice) {
        // list of invoices in file
    }
}

public class Repository {
    // now we can use different implemnetations of InvoiceRepository interface
    private InvoiceRepository invoiceRepository;
    public Repository(InvoiceRepository invoiceRepository){
        this.invoiceRepository = invoiceRepository;
    }
}
