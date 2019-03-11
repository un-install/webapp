package hwspring1.entities;

public abstract class AbstractBird implements Bird{
    private String clolor = "black";
    private float wheight = 5;

    public AbstractBird(){
    }

    public AbstractBird(String clolor, float wheight) {
        this.clolor = clolor;
        this.wheight = wheight;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +"{Voice = " + voice() + " can fly? = " + canFly() + " clolor='" + clolor + '\'' +
                ", wheight=" + wheight +"}";
    }
}
