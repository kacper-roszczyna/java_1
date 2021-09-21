package pl.roszczyna.teaching.objects.studio.authorv2;

import pl.roszczyna.teaching.objects.studio.Song;

public class LyricsAuthor extends Author {

    public LyricsAuthor(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Song write() {
        return null;
    }

    @Override
    public void create() {
        System.out.println("Creating lyrics");

    }
}
