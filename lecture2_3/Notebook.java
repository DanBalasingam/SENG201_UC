package lecture2_3;

import java.util.ArrayList;
import java.util.List;

public class Notebook {

    // static belongs to the class, otherwise it would belong to the object
    private static final List<Notebook> ALL_NOTEBOOKS = new ArrayList<>();

    // final can't be changed once initialized
    private final List<Note> notes = new ArrayList<>();

    public Notebook() {
        ALL_NOTEBOOKS.add(this);
    }

    public static int count() {
        return ALL_NOTEBOOKS.size();
    }

    public static void addToAllNotebooks(Note note) {
        for (Notebook notebook : ALL_NOTEBOOKS) {
            notebook.writeNote(note);
        }
    }

    public void writeNote(Note note) {
        notes.add(note);
    }

    public void writeNoteWithoutDuplicate(Note newNote) {
        for (Note existingNote : notes) {
            if (existingNote.content().equals(newNote.content())) {
                return;
            }
        }
        writeNote(newNote);
    }

    public Note readNote(int index) {
        return notes.get(index);
    }

    // getters
    public int getNumberOfNotes() {
        return notes.size();
    }
}
