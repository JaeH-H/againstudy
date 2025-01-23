package jan23_3;

public class Person {
    //속성
    private String name;
    private String address;

    //생성자
    public Person(){}

    public Person(String name){
        this.name = name;
    }

    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    //기능
    public void introduce(){
        System.out.println("이름 : " + name + "   주소 : " + address);
    }

    public void introduceB(String name){
        this.name = name;
        System.out.println("이름 : " + name);
    }

    public int add(int a, int b){
        int result = a + b;
        return  result;
    }

    //Getter
    public String getName(){
        return this.name;
    }

    public String getAddress(){
        return this.address;
    }

    //Setter
    public void setAddress(String address){
        this.address = address;
    }


}
