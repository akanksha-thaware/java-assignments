package dependencyinversion.good;

public class Repository {
    // using interface, now we can use different implementations of InvoiceRepository interface
    private InvoiceRepository invoiceRepository;
    public Repository(InvoiceRepository invoiceRepository){
        this.invoiceRepository = invoiceRepository;
    }
}