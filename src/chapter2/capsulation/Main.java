package chapter2.capsulation;

public class Main {

    public static void main(String[] args) {

        // 생성자 호출
        Person person = new Person("ilsam");

        // 인스턴스 변수 접근
//        person.name = "ilsam";
//        person.secret = "??";

        // 인스턴스 매서드 접근
        person.methodA();
//        person.methodB();

        // 게터
        String name = person.getName();
        System.out.println("이름: " + name);

        // 세터
        person.setName("Steve");
        String name2 = person.getName();
        System.out.println("이름: " + name2);
    }
}
