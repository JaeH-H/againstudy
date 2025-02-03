package jan24;

public class Controller {
    //속
    private Service service;

    //생
    public Controller(Service service){
        this.service = service;
    }

    //기

    //생성
    public void createController(String data){
        service.createService(data);
    }

    //읽기
    public String getController(){
        String data = service.getService();
        return data;
    }

    //수정
    public void updateController(String data){
        service.updateService(data);
    }

    //삭제
    public void deleteController(){
        service.deleteService();
    }

}
