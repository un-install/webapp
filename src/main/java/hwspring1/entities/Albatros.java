package hwspring1.entities;

import org.springframework.stereotype.Component;

@Component("albatros_strd")
public class Albatros extends AbstractBird {

    public Albatros() {
    }

    public Albatros(String clolor, float wheight) {
        super(clolor, wheight);
    }

    @Override
    public String voice() {
        return "ach-ach-ach";
    }

    @Override
    public boolean canFly() {
        return true;
    }
}
