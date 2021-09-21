package pl.roszczyna.teaching.objects;

public class EatingUtensil implements Utensil {

    protected String name;

    public EatingUtensil(String name) {
        this.name = name;
    }

    public void eatWith() {
        System.out.println("Eating with " + name);
    }

    @Override
    public void use() {
        eatWith();
    }
}
