package blog.yanbin.ws;

import org.apache.axis.client.Call;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ServiceTest {

    @Test
    void getVersion() throws Exception {
        String servicesURL = "http://localhost:8080/services/Version";
        Call call = new Call(servicesURL);
        String result = (String)call.invoke("", "getVersion", null);

        assertTrue(result.contains("Apache Axis version: 1.4"));
    }

    @Test
    void sayHello() throws Exception {
        String servicesURL = "http://localhost:8080/services/HelloService";
        Call call = new Call(servicesURL);
        String result = (String)call.invoke("", "sayHello", new Object[]{"Yanbin"});

        assertEquals("Hello Yanbin", result);
    }

}
