package jan24_homework;

import java.util.ArrayList;
import java.util.List;

public class Library {
    //속
    private List<Book> bookList = new ArrayList<>();

    //생

    //기
    public void addBook(Book book) {
        bookList.add(book);
    }

    public void getFindTitle() {
        for(int i = 0; i < bookList.size(); i++){
            System.out.println(bookList.get(i).getTitle() + " : 순서 : " + i);
        }
//        for(String title : libraries){
//            System.out.println(title);
//        }
    }

    /**
     *return과 break
     * return은 메서드 자체를 종료
     * break는 반복문만 종료하고 남은 메서드는 실행
     */
    public void getTitle(String title) {
        for (Book book : bookList) {
            if(book.getTitle().equals(title)) {
                System.out.println(book.getTitle());
                return;
            }
        }
        System.out.println("책이 없습니다.");
    }

    //boolean을 써서 찾으면 반복문이 종료 후 조건문이 출력되게 한다.
    public void getTitleB(String title) {
        boolean found = false;
        for (Book book : bookList) {
            if(book.getTitle().equals(title)) {
                System.out.println(book.getTitle());
                found = true;
                break; // 찾으면 반복문 종료
            }
        }
        if (!found){
        System.out.println("책이 없습니다.");
        }
    }

    //책 상세 정보 출력
    public void getInformation() {
        for(int i = 0; i < bookList.size(); i++) {
            Book book = bookList.get(i);
            System.out.println(book.getBookInformation());
        }
    }
}
