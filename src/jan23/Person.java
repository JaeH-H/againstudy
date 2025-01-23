package jan23;

public class Person {
    //속
    private String name;
    private String address;


    //생
    public Person(String name){
        this.name = name;
    }

    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    //기
    public void introduce(){
        System.out.println(name);
    }

    public int add(int a, int b){
//        int c;
//        c = a + b;
//        return c;
//
        return a+b;
    }

    public String getName(){
        return this.name;
    }

    public String getAddress(){
        return this.address;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public Person update(Person person){
//      Person person = new Person(name, address);
      this.name = person.getName();
      this.address = person.getAddress();

//      person.setName();
//      person.setAddress("서울시");

      return this;
    }

}
