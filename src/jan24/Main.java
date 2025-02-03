package jan24;

import java.util.ArrayList;
import java.util.List;

public class Main {
    //속

    //생

    //기
    public static void main(String[] args) {
        C c = new C();
        B b = new B(c);
        A a = new A(b);

        String data2 = a.getDataFromMain("data");
        System.out.println(data2);

        Repository repository = new Repository();
        Service service = new Service(repository);
        Controller controller = new Controller(service);

        //생성
        String createData = "이게 맞나?";
        controller.createController(createData);

        //읽기
        String getData = controller.getController();
        System.out.println("읽기 : " + getData);

        //수정
        controller.updateController("이걸로 수정");
        String update = controller.getController();
        System.out.println("수정 : " + update);

        //삭제
        controller.deleteController();
        String delete = controller.getController();
        System.out.println("삭제 : " + delete);

    }
}
