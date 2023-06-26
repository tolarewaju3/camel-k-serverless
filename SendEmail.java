import org.apache.camel.builder.RouteBuilder;

public class SendEmail extends RouteBuilder {
    @Override
    public void configure() throws Exception {

        from("kafka:signups?brokers=my-cluster-kafka-bootstrap.camel-k.svc:9092")
            .unmarshal().json()
            .log("Sending message to new customer: ${body[firstname]}\n")
            .log("To:${body[email]}\nSubject: Welcome to NewCo\nHello ${body[firstname]}, we're so glad you joined us here at NewCo ");

            
    }
}
