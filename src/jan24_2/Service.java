package jan24_2;

public class Service {
    //속
    private Repository repository;

    //생
    public Service(Repository repository){
        this.repository = repository;
    }

    //기

    //생성
    public void createService(String create){
        repository.createRepository(create);
    }

    //읽기
    public String getService(){
        String read = repository.getRepository();
        return read;
    }

    //수정
    public void updateService(String update){
        repository.updateRepository(update);
    }

    //삭제
    public void deleteService(){
        String delete = null;
        repository.deleteRepository(delete);
    }
}
