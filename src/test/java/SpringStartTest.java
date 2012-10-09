import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.thakurn.messages.*;
import org.junit.runner.*;
import org.junit.Test;
import static org.junit.Assert.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-injection-test-conf.xml"})
public class SpringStartTest {
    private final static Logger logger = LoggerFactory.getLogger(SpringStartTest.class);

    @Autowired
    private DefaultMessage message = null;

    /**
     * Tests message.
     */
    @Test
    public void testMessage() {   
        logger.debug("message = xxxxxxxxxxxxxxxxxxxxxxx" );
        assertEquals("Naveen Rocks!", message.getMessage());
    }
    
}