package chapter2.interitance;

public class Parent {
    public String familyName = "패밀리";
    public int honor = 10;

    public Parent() {
        System.out.println("부모 생성자");
    }

    public void introduceFamily() {
        System.out.println("우리 " + this.familyName + " 가문은 대대로 명성을 이어온...");
    }
}
