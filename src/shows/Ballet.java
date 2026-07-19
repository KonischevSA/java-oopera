package shows;

import persons.*;

public class Ballet extends MusicalShow {
    protected String choreographer;

    public Ballet(String title, int duration, Director director, String musicAuthor, String librettoText,
                  String choreographer) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }
}
