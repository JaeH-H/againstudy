package jan24_1;

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
        String read = repository.getRepository();
        return read;
    }

    //수정
    public void updateService(String update){
        repository.updateRepository(update);
    }

    //삭제
    public void deleteService(){
        //삭제를 위한 null
        //근데 초기값이 null이 아닌가?
        String delete = null;
        repository.deleteRepository(delete);
    }
}
