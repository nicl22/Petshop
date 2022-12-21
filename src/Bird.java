public class Bird extends Pet implements Fly,Walk {
    private float wingspan;

    public Bird(String name, int age, float wingspan) {
        super(name, age);
    }

    @Override
    public void eats() {

    }
}
