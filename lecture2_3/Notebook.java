package lecture2_3;

import java.util.ArrayList;
import java.util.List;

public class Notebook {

    private List<Note> notes = new ArrayList<>();

    public void writeNote(Note note) {
        notes.add(note);
    }

    public Note readNote(int index) {
        return notes.get(index);
    }

    // getters
    public int getNumberOfNotes() {
        return notes.size();
    }
}
