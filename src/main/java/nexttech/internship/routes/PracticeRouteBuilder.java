package nexttech.internship.routes;

import org.apache.camel.builder.RouteBuilder;

public class PracticeRouteBuilder extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("file:C:/Users/nexttech/Desktop/inputPractice?noop=true")
                .to("activemq:queue:my_queue");
    }
}