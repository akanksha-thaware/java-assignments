package dependencyinversion.good;

import singleresponsibility.good.Invoice;

interface InvoiceRepository {
    void save(Invoice invoice);
}
