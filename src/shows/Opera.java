package shows;

import persons.*;

public class Opera extends MusicalShow {
    protected int choirSize;

    public Opera(String title, int duration, Director director, String musicAuthor, String librettoText,
                 int choirSize) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }
}
