package paxexam;

import com.intuit.karate.junit4.Karate;

import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.runner.RunWith;
import org.ops4j.pax.exam.Configuration;
import org.ops4j.pax.exam.Option;
import org.ops4j.pax.exam.junit.PaxExamServer;

import static org.ops4j.pax.exam.CoreOptions.bundle;

@RunWith(Karate.class)
public class HttpTest {

    public static final int HTTP_SERVICE_DEFAULT_PORT = 8080;

    @ClassRule
    public static PaxExamServer serverRule = new PaxExamServer();

    @BeforeClass
    public static void setup() {
        System.setProperty("karate.env", "osgi.test");
        System.setProperty("test.server.url", "http://localhost:" + HTTP_SERVICE_DEFAULT_PORT);
    }
    
    @Configuration
    public Option[] configuration() {
        return new Option[] {
            bundle("mvn:org.apache.felix/org.apache.felix.eventadmin/1.4.8"),
            bundle("mvn:org.apache.felix/org.apache.felix.scr/2.0.12"),
            bundle("mvn:org.apache.felix/org.apache.felix.http.jetty/3.1.6"),
            bundle("mvn:org.apache.felix/org.apache.felix.http.servlet-api/1.1.2"),
            bundle("mvn:org.apache.felix/org.apache.felix.webconsole/4.2.16/jar/all"),
            bundle("mvn:org.apache.felix/org.apache.felix.configadmin/1.8.14"),
            bundle("mvn:org.apache.felix/org.apache.felix.log/1.2.4"),
            //vmOption("-Xrunjdwp:transport=dt_socket,server=y,suspend=y,address=7788"),
        };
     }
}