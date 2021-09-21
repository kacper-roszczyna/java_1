package pl.roszczyna.teaching.objects;

public class Author {
    private String firstName;
    private String lastName;
    private AuthorType type;

    public Author(String firstName,
                  String lastName,
                  AuthorType type) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.type = type;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setType(AuthorType type) {
        this.type = type;
    }
}
