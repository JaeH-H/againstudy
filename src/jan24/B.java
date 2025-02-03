package jan24;

public class B {
    //속
    private C c;

    //생
    public B(C c){
        this.c = c;
    }
    //기
    public String getDataFromA(String data){
       String data2 = c.getDataFromB(data);
       return data2;

    }

}
