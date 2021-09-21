package pl.roszczyna.teaching.objects;

import java.util.ArrayList;
import java.util.List;

public class Song {

    private List<Version> versions;
    private List<Version> lyrics;
    private List<Author> authors;
    private SongState state;

    public Song(List<Author> originalAuthors) {
        versions = new ArrayList<>();
        lyrics = new ArrayList<>();
        authors = new ArrayList<>(originalAuthors);
    }

    public List<Version> getVersions() {
        return new ArrayList<>(versions);
    }

    public void addVersion(Version version) {
        versions.add(version);
    }

    public List<Version> getLyricsVersions() {
        return new ArrayList<>(lyrics);
    }

    public void addLyrics(Version version) {
        lyrics.add(version);
    }

    public void release() {
        if(state == SongState.DONE) {
            state = SongState.RELEASED;
        } else {
            throw new IllegalArgumentException();
        }
    }
}
