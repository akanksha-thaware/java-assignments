package interfacesegregation.violation;
import java.util.*;
interface Message {
    //send a message
    void send(String recipient, String content);
    // attach a file
    void attachFile(String filePath);
    // schedule a message to send
    void schedule(Date date);
}
class EmailInvoiceMessage implements Message {
    public void send(String recipient, String content) {

    }
    public void attachFile(String filePath){

    }
    public void schedule(Date date) {

    }
}

class TextInvoiceMessage implements Message {
    public void send(String recipient, String content) {

    }
    // ( A TEXTMESSAGE cannot attach a file) - wasteful of implementating attachFile()
    public void attachFile(String filePath){

    }
    public void schedule(Date date) {

    }
}

public class Main {
}