package jan23_2;

public class Person {
    //속성
    private String name;
    private String address;

    //생성자
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

    public int sub(int a, int b){
        return a - b;
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
