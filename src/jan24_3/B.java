package jan24_3;

public class B {
    //속
    private C c;

    //생
    public B(C c){
        this.c = c;
    }

    //기
    public String getFromA(String data){
        String data2 = c.getFormB(data);
        return data2;
    }
}
