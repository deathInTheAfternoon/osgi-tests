import com.thakurn.messages.IProcessor

// define the implementation in Groovy
class ProcessorGroovy implements IProcessor{

    public String process(String message) {
        // change the implementation to surround the message in quotes
        return "' Blaahhhh [ " + message + "]"
    }
}