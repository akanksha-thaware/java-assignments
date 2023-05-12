package dependencyinversion.good;
import singleresponsibility.good.Invoice;

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