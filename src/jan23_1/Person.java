package jan23_1;

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
    public void introduceName(){
        System.out.println("이름 : " + name);
    }

    public void introduceAddress(){
        System.out.println("주소 : " + address);
    }

    public int add(int a, int b){
        return a + b;
    }

    //Getter
    public String getName(){
        return this.name;
    }

    public String getAddress(){
        return this.address;
    }

    //Setter
    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }

}
