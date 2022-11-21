package project.common;


import project.CustomerManagementApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { CustomerManagementApplication.class })
public class CucumberSpingConfiguration {
    
}
