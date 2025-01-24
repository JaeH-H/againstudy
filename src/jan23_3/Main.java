package jan23_3;

public class Main {
    public static void main(String[] args) {
        Person john = new Person("john");
        john.introduce();

        Person elice = new Person();
        elice.introduceB("elice");

        int result = john.add(1, 1);
        System.out.println("결과 : " + result);

        Person steve = new Person("steve", "서울");
        steve.introduce();

        String nameA = john.getName();
        System.out.println("이름 : " + nameA);

        String nameB = steve.getName();
        String addressB = steve.getAddress();
        System.out.println("이름 : " + nameB + "   주소 : " + addressB);

        john.setAddress("부산");
        String addressA = john.getAddress();
        System.out.println("주소 : " + addressA);

    }
}
