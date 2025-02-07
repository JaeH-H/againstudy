package jan24_homework;

public class Book {
    //속
    private String title;
    private String author;
    private boolean isAvailable;

//    private Library library;

    //생

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

//    public Book(Library library) {
//        this.library = library;
//    }

    //기
    public String getTitle() {
        return title;
    }
}
