package ru.liga;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import ru.liga.service.PersonBusinessService;

@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan("ru.*")
public class App {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(App.class);
        PersonBusinessService bean = applicationContext.getBean(PersonBusinessService.class);
        bean.printAll();
        bean.multiplyRate(1.22);
        bean.printAll();
    }

}
