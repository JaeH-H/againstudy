package jan23_1;

public class Main {
    public static void main(String[] args) {
        Person john = new Person("john");
        john.introduceName();

        int resultA = john.add(1,1);
        System.out.println("결과 : " + resultA);

        Person steve = new Person("steve", "seoul");
        steve.introduceName();
        steve.introduceAddress();

        int resultB = steve.add(2, 5);
        System.out.println("결과 : " + resultB);

        String nameA = john.getName();
        System.out.println("이름 : " + nameA);

        String nameB = steve.getName();
        String addressB = steve.getAddress();
        System.out.println("이름 : " + nameB + "   주소 : " + addressB);

        john.setAddress("busan");
        String addressA = john.getAddress();
        System.out.println("주소 : " + addressA);

    }
}
