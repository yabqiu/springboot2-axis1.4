package blog.yanbin.ws;

import org.apache.axis.client.AdminClient;
import org.junit.jupiter.api.Test;

class RunAdminClient {

    @Test
    void deployHelloService() {
        AdminClient.main(new String[]{
            "-lhttp://localhost:8080/services/AdminService",
                "src/test/resources/deploy.wsdd"
        });
    }

    @Test
    void undeployHelloService() {
        AdminClient.main(new String[]{
            "-lhttp://localhost:8080/services/AdminService",
            "src/test/resources/undeploy.wsdd"
        });
    }
}
