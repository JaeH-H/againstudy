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

    /**
     *기능을 두가지를 가지고 있다.
     *수정기능과 출력기능을 가지고 있어 유지보수에 힘들다. 안티패턴
     * 예를 들면 생성자는 조립설명서라서 기본적으로 값을 저장?해서 가지고
     * 있고 Setter로 수정하는 것이고
     * 이건 그 두가지를 동시에 하고 있음
     * 변형한 코드처럼 다른 메서드를 이용해서 똑같은 기능을 할 수 있음
     */
    public void introduceB(String name){
//        this.name = name;
        setName(name);
//        System.out.println("이름 : " + name);
        introduce();
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

    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }


}
