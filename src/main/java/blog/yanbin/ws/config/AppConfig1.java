package blog.yanbin.ws.config;


import org.apache.axis.transport.http.AdminServlet;
import org.apache.axis.transport.http.AxisHTTPSessionListener;
import org.apache.axis.transport.http.AxisServlet;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.servlet.annotation.WebListener;
import javax.servlet.annotation.WebServlet;

//@Configuration
@ServletComponentScan
public class AppConfig1 {

    @WebServlet({"/servlet/AxisServlet", "/services/*", "/axis/services/*"})
    public static class MyAxisServlet extends AxisServlet {
    }

    @WebServlet(loadOnStartup = 100)
    public static class MyAxisAdminService extends AdminServlet {
    }

    @WebListener
    public static class MyAxisSessionListener extends AxisHTTPSessionListener {
    }
}
