package pl.roszczyna.teaching.objects.authorv2;

import pl.roszczyna.teaching.objects.Song;
import pl.roszczyna.teaching.objects.Version;

public class MusicAuthor extends Author {


    public MusicAuthor(String firstName,
                       String lastName) {
        super(firstName, lastName);
    }

    public Version compose() {
        return null;
    }

    @Override
    public void create() {
        System.out.println("Creating music");
    }
}
