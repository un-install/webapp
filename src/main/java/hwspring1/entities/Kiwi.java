package hwspring1.entities;

import org.springframework.stereotype.Component;

@Component("kiwi_strd")
public class Kiwi extends AbstractBird {

    public Kiwi() {
    }

    public Kiwi(String clolor, float wheight) {
        super(clolor, wheight);
    }

    @Override
    public String voice() {
        return "pipipi";
    }

    @Override
    public boolean canFly() {
        return false;
    }
}
