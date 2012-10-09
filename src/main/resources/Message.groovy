// import the Messenger interface (written in Java) that is to be implemented
import com.thakurn.messages.IMessage;

// define the implementation in Groovy
class Message implements IMessage {
    private String message = "Bingo"

    public String getMessage() {
        // change the implementation to surround the message in quotes
        return "' Aha, " + this.message + "'"
    }

    public void setMessage(String message) {
        this.message = message
    }
}