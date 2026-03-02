package lecture2_3;

public record Note(String content) {

    // change to class to uncomment code!
    // private final String content;

    // public Note(String content) {
    // // 'this' refers to the object in which the method is invoked
    // // so to refer to the current object and have the methods local var
    // // be accessible we use 'this'
    // if (content == null)
    // System.out.println("content is null");

    // this.content = content;
    // }

    public static Note createNote(String content) {
        return new Note(content);
    }

    public static Note createWithManyParagraphs(String... paragraphs) {
        return new Note(String.join("\n", paragraphs));
    }

    public static Note createEmptyNote() {
        return new Note("<empty note>");
    }

    // public String getContent() {
    // return content;
    // }
}
