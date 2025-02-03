package jan24_2;

public class Controller {
    //속
    private Service service;

    //생
    public Controller(Service service){
        this.service = service;
    }

    //기

    //생성
    public void createController(String create){
        service.createService(create);
    }

    //읽기
    public String getController(){
        String read = service.getService();
        return read;
    }

    //수정
    public void updateController(String update){
        service.updateService(update);
    }

    //삭제
    public void deleteController(){
        service.deleteService();
    }
}
