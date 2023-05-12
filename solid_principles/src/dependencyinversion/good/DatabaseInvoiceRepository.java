package dependencyinversion.good;
import singleresponsibility.good.Invoice;

class DatabaseInvoiceRepository implements InvoiceRepository {

    @Override
    public void save(Invoice invoice) {
        // list of invoices in db
    }
}