package jan24_homework;

public class Main {
    //속

    //생

    //기
    public static void main(String[] args) {
        Library library = new Library();

        //Book의 생성자를 통한 책 생성
        Book bookA = new Book("새로운 책1", "미상");
        Book bookB = new Book("새로운 책2", "미상");
        Book bookC = new Book("새로운 책3", "미상");
        Book bookD = new Book("새로운 책4", "미상");

        //도서관에 책 저장
        library.addBook(bookA);
        library.addBook(bookB);
        library.addBook(bookC);
        library.addBook(bookD);

        //도서관에서 책 전체 조회
        library.getFindTitle();

        //도서관에서 제목으로 검색
        library.getTitle("새로운 책4");

        library.getTitleB("새로운 책1");

        //책 상세 정보 출력
        library.getInformation();


    }
}
