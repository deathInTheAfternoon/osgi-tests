import com.thakurn.messages.*;
import org.springframework.context.*;
import org.springframework.context.support.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import java.io.IOException;

public class SpringStart {

 	private final static Logger logger = LoggerFactory.getLogger(SpringStart.class); 

    public static void main(String[] args) {
        
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/spring-injection-conf.xml");
        
        DefaultMessage message = (DefaultMessage) applicationContext.getBean("defaultMessage");
        logger.debug("Mesage = xxxxxxxxxxxxxxxxxxx " + message.getMessage());

        IMessage imessage = (IMessage) applicationContext.getBean("messenger");

        try {
            logger.debug(imessage.getMessage());
        	System.in.read();
        	System.out.println(imessage.getMessage());	
        }catch(Exception e){
        	logger.debug(e.toString());
        }
        

    }

}
   