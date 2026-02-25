package lecture2_3;

public class Note {

    final String content;

    Note(String content) {
        // 'this' refers to the object in which the method is invoked
        // so to refer to the current object and have the methods local var
        // be accessible we use 'this'
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
