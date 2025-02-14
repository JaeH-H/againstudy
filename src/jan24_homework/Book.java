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

    public String getAuthor() {
        return author;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public String isAvailable() {
        // isAvailable이 true일 때 '대여가능' 출력
        if (isAvailable) {
            return "대여 가능";
        } else {
            return "대여 불가능";
        }
    }

    //책 상세 정보 출력
    public String getBookInformation() {
        return "제목 : " + getTitle() + " | 저자 : " + getAuthor() + " | 대여 가능 여부 : " + isAvailable();
    }
}
