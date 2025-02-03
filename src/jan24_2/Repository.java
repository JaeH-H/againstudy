package jan24_2;

public class Repository {
    //속
    private String save;

    //생

    //기

    //생성
    public void createRepository(String create){
        this.save = create;
        System.out.println("생성 : " + this.save);
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
