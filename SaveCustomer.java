// camel-k: dependency=camel:jdbc
// camel-k: dependency=mvn:io.quarkus:quarkus-jdbc-postgresql

import org.apache.camel.builder.RouteBuilder;

public class SaveCustomer extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        
    }
}
