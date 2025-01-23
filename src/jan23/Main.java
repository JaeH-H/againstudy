package jan23;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Person john = new Person("john");
        john.introduce();

        int c = john.add(1, 3);
        System.out.println("결과 : " + c);

        Person steve = new Person("steve", "address");
        steve.introduce();

        int d = steve.add(1,1);
        System.out.println("결과 :" + d);

        String name = john.getName();
        String address = john.getAddress();
        System.out.println(name + address);

        String nameB = steve.getName();
        String addressB = steve.getAddress();
        System.out.println(nameB + addressB);

        john.setAddress("johnaddress");
        String addressC = john.getAddress();
        System.out.println(addressC);

        List<Person> persons = List.of(john, steve);
//        int i;
        for(int i=0; i< persons.size(); i++){
            if("jhon".equals(john.getName())){
                System.out.println("jhon 찾았다.");
            }
        }

        Person person = new Person("홍길동", "서울시");
        person.update(steve);
        System.out.println(person.getName() + person.getAddress());

    }
}
