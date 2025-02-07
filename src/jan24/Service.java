package jan24;

public class Service {
    //속
    private Repository repository;

    //생
    public Service(Repository repository){
        this.repository = repository;
    }

    //기

    //생성
    public void createService(String data){
        repository.createRepository(data);
    }

    //읽기
    public String getService(){
       String data = repository.getRepository();
       return  data;
    }

    //수정
    public void updateService(String data){
        repository.updateRepository(data);
    }

    //삭제
    public void deleteService(){
        String data = null;
        repository.deleteRepository(data);
    }

}
