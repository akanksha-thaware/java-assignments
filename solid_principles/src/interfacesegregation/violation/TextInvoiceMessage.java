package interfacesegregation.violation;

import java.util.Date;

class TextInvoiceMessage implements IMessage {
    public void send(String recipient, String content) {

    }
    // ( A TEXTMESSAGE cannot attach a file) - wasteful of implementating attachFile()
    public void attachFile(String filePath){

    }
    public void schedule(Date date) {

    }
}