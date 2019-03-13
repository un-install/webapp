package hwspring1.entities;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("crown_strd")
@Primary
public class Crown extends AbstractBird {

    public Crown() {
    }

    public Crown(String clolor, float wheight) {
        super(clolor, wheight);
    }

    @Override
    public String voice() {
        return "car-car";
    }

    @Override
    public boolean canFly() {
        return true;
    }
}
