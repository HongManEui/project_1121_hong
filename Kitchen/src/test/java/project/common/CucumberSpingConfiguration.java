package project.common;


import project.KitchenApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { KitchenApplication.class })
public class CucumberSpingConfiguration {
    
}
