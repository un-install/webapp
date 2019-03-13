package hwspring1.entities;

import hwspring1.AppConfig;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class BeanLifeCicleTestMain {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        List<Cage> cageList = new ArrayList<Cage>();

        cageList.add(context.getBean(Cage.class));
        cageList.add(context.getBean(Cage.class));
        cageList.add(context.getBean("cage_postproc", Cage.class));

        cageList.forEach(System.out::println);

        context.close();
    }
}
