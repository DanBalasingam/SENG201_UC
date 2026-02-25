package lecture2_3;

public class Driver {

    void main() {
        Notebook notebook = new Notebook();
        Note note1 = new Note("hello");
        Note note2 = new Note("world");

        notebook.writeNote(note1);
        notebook.writeNote(note2);

        int numberOfNotes = notebook.getNumberOfNotes();
        // for loop for index of array
        for (int i = 0; i < numberOfNotes; i++) {
            System.out.println(notebook.readNote(i).getContent());
        }

        // notebook.notes = new Note[10];
        // notebook.numberOfNotes = 20;
        // notebook.readNote(15);
    }
}
