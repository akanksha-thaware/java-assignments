package dependencyinversion.violation;

import singleresponsibility.good.Invoice;

interface InvoiceRepository {
    void save(Invoice invoice);
}
