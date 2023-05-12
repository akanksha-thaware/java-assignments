package interfacesegregation.violation;

import java.util.Date;

public interface IMessage {
    //send a message
    void send(String recipient, String content);
    // attach a file
    void attachFile(String filePath);
    // schedule a message to send
    void schedule(Date date);
}
