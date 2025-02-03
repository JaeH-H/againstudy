package jan24_1;

public class Main {
    //속

    //생

    //기
    public static void main(String[] args) {
        C c = new C();
        B b = new B(c);
        A a = new A(b);

        String data = "data";
        String data2 = a.getFromMain(data);
        System.out.println(data2);


        Repository repository = new Repository();
        Service service = new Service(repository);
        Controller controller = new Controller(service);

        //생성
        String create = "create";
        controller.createController(create);

        //읽기
        String read = controller.getController();
        System.out.println("읽기 : " + read);

        //수정
        controller.updateController("update");
        String update = controller.getController();
        System.out.println("수정 : " + update);

        //삭제
        controller.deleteController();
        String delete = controller.getController();
        System.out.println("삭제 : " + delete);
    }
}
