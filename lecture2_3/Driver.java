package lecture2_3;

public class Driver {

    void main() {
        Notebook notebook = new Notebook();
        Note note1 = Note.createNote("hello");
        Note note2 = Note.createNote("world");

        Note note3 = Note.createEmptyNote();
        Note note4 = Note.createWithManyParagraphs("hello", "world");

        notebook.writeNote(note1);
        notebook.writeNote(note2);
        notebook.writeNote(note3);
        notebook.writeNote(note4);

        int numberOfNotes = notebook.getNumberOfNotes();
        // for loop for index of array
        for (int i = 0; i < numberOfNotes; i++) {
            System.out.println(notebook.readNote(i).content());
        }

        // notebook.notes = new Note[10];
        // notebook.numberOfNotes = 20;
        // notebook.readNote(15);
    }
}
