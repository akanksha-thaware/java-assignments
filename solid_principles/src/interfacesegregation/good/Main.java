package interfacesegregation.good;
import java.util.*;
// creating 3 seperate interfaces
interface Message {
    void send(String recipient, String content);
}

interface Attachable {
    void attachFile(String filePath);
}

interface Schedulable {
    void schedule(Date date);
}
// all 3
class EmailInvoiceMessage implements Message, Attachable, Schedulable {
    public void send(String recipient, String content) {

    }

    public void attachFile(String filePath) {

    }

    public void schedule(Date date) {

    }
}
// only 1
class TextInvoiceMessage implements Message {
    public void send(String recipient, String content) {

    }
}

public class Main {
}
