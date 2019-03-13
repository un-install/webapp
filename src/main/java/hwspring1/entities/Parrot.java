package hwspring1.entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("kesha")
@PropertySource("classpath:hwspring1/parrot.properties")
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
@Lazy
public class Parrot extends AbstractBird {
    private boolean canFly = false;
    private int id;

    public Parrot(@Value("${parrot_clr}")String clolor,@Value("2") float wheight) {
        super(clolor, wheight);
        id = (int)(Math.random() * 1000);
    }

    @Override
    public String voice() {
        return "Kesha";
    }

    @Override
    public boolean canFly() {
        return canFly;
    }

    @Override
    public String toString() {
        return "Parrot{" + super.toString() +
                ",parrot id=" + id +
                '}';
    }

    @PostConstruct
    private void init() {
        canFly = true;
        System.out.println("Init " + this);
    }

    @PreDestroy
    private void preDestroy() {
        System.out.println("Predistroing " + this);
    }
}
