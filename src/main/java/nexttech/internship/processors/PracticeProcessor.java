package nexttech.internship.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class PracticeProcessor implements Processor {
    public void process(Exchange exchange) throws Exception {
        System.out.println("Processing the string... " + exchange.getIn().getBody(String.class));
    }
}
