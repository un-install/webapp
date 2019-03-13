package hwspring1;

import hwspring1.entities.*;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        List<Bird> birds = new ArrayList<>();

        Bird albatros = context.getBean("albatros_strd", Albatros.class);
        Bird crown = context.getBean("crown_strd", Crown.class);
        Bird kiwi = context.getBean("kiwi_strd", Kiwi.class);
        Bird penguin = context.getBean("pinguin_strd", Pinguin.class);
        Bird sparrow = context.getBean("sparrow_strd", Sparrow.class);

        Bird whiteCrown = context.getBean("crown_white", Crown.class);
        Bird straus = context.getBean("kiwi_straus", Kiwi.class);
        Bird jackSparrow = context.getBean("sparrow_captain", Sparrow.class);

        Bird primary = context.getBean(Bird.class);

        birds.add(albatros);
        birds.add(crown);
        birds.add(kiwi);
        birds.add(penguin);
        birds.add(sparrow);
        birds.add(whiteCrown);
        birds.add(straus);
        birds.add(jackSparrow);
        birds.add(primary);

        birds.forEach(System.out::println);
        context.close();
    }
}
