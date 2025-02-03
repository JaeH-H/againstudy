package jan24;

public class A {
    //속
    private B b;

    //생
    public A(B b){
        this.b = b;
    }

    //기
    public String getDataFromMain(String data){
       String data2 = b.getDataFromA(data);
       return data2;
    }

}
