package hwspring1.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Cage {
    private int squere = 3;
    @Autowired
    @Qualifier("kesha")
    private Parrot parrot;

    private int id;

    public void setSquere(int squere) {
        this.squere = squere;
    }

    public void setParrot(Parrot parrot) {
        this.parrot = parrot;
    }

    public Cage(Parrot parrot) {
        this.parrot = parrot;
        id = (int)(Math.random() * 1000);
    }

    @Override
    public String toString() {
        return "Cage{" +
                "parrot=" + parrot +
                ",cage id=" + id +
                '}';
    }
}
