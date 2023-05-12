package interfacesegregation.good;

import java.util.Date;
// all 3
class EmailInvoiceMessage implements IMessage, IAttachable, ISchedulable {
    public void send(String recipient, String content) {

    }

    public void attachFile(String filePath) {

    }

    public void schedule(Date date) {

    }
}