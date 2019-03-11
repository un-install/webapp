package hwspring1.entities;

import org.springframework.stereotype.Component;

@Component("sparrow_strd")
public class Sparrow extends AbstractBird {

    public Sparrow() {
    }

    public Sparrow(String clolor, float wheight) {
        super(clolor, wheight);
    }

    @Override
    public String voice() {
        return "chirick-chirick";
    }

    @Override
    public boolean canFly() {
        return true;
    }
}
