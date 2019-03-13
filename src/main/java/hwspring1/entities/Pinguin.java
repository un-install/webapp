package hwspring1.entities;

import org.springframework.stereotype.Component;

@Component("pinguin_strd")
public class Pinguin extends AbstractBird {

    public Pinguin() {
    }

    public Pinguin(String clolor, float wheight) {
        super(clolor, wheight);
    }

    @Override
    public String voice() {
        return "arrrrr-tash";
    }

    @Override
    public boolean canFly() {
        return false;
    }
}
