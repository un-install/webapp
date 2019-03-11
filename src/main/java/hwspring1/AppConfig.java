package hwspring1;

import hwspring1.entities.Crown;
import hwspring1.entities.Kiwi;
import hwspring1.entities.Sparrow;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("hwspring1.entities")
public class AppConfig {

    @Bean("crown_white")
    public Crown returnCrown(){
        return new Crown("white", 3);
    }

    @Bean("kiwi_straus")
    public Kiwi returnKiwi(){
        return new Kiwi("white", 31);
    }

    @Bean("sparrow_captain")
    public Sparrow returnSparrow(){
        return new Sparrow("white", 78);
    }
}
