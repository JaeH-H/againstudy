package jan24_2;

public class A {
    //속
    private B b;

    //생
    public A(B b){
        this.b = b;
    }

    //기
    public String getFromMain(String data){
        String data2 = b.getFromA(data);
        return data2;
    }
}
