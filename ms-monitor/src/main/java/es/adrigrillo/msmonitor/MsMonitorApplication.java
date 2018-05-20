package es.adrigrillo.msmonitor;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class MsMonitorApplication {
    public static void main(String[] args) {
        SpringApplication.run(MsMonitorApplication.class, args);
    }
}
