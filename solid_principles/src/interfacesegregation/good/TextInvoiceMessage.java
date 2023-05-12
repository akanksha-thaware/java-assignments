package interfacesegregation.good;

// only 1
class TextInvoiceMessage implements IMessage {
    public void send(String recipient, String content) {

    }
}