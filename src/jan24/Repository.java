package jan24;

public class Repository {
    //속
    private String save;

    //생

    //기

    //생성 - 데이터베이스에 저장이라고 가정
    public void createRepository(String data){
        this.save = data;
        System.out.println("저장 : " + data);
    }

    //읽기
    public String getRepository(){
        return this.save;
    }

    //수정
    public void updateRepository(String update){
        this.save = update;
    }

    //삭제
    public void deleteRepository(String delete){
        this.save = delete;
    }

}
