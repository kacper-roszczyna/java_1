package pl.roszczyna.teaching.objects.authorv2;

public abstract class Author implements Creative {

    protected String firstName;
    protected String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public void create() {

    }
}
