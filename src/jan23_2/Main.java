package jan23_2;

public class Main {
    public static void main(String[] args) {
        Person john = new Person("john");
        john.introduce();

        int resultA = john.sub(10, 2);
        System.out.println("결과 : " + resultA);

        Person steve = new Person("steve", "서울");
        steve.introduce();

        int resultB = steve.sub(1, 1);
        System.out.println("결과 : " + resultB);

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
