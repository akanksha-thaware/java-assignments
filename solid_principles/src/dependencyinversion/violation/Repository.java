package dependencyinversion.violation;

public class Repository {
    private final DatabaseInvoiceRepository repo;
    // using concerete implementation, cannot use different implemnetations of InvoiceRepository interface
    public Repository(){
        repo = new DatabaseInvoiceRepository();
    }

}
