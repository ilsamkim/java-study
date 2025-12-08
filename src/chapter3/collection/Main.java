package chapter3.collection;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // 배열의 한계(정적)
        // 선언과 동시에 길이를 설정 필요
        int[] numbers = new int[3];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        // 배열의 정적인 특정의 한계
//        numbers[3] = 40;

        // 컬렉션
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);

        // ArrayList 활용
        ArrayList<String> names = new ArrayList<>();

        //데이터 추가
        names.add("Ilsam");
        names.add("Steve");
        names.add("Isac");
        names.add("1");
        names.add("2");

        // 순서 보장
        System.out.println("names = " + names);

        // 중복 데이터 허용
        names.add("Ilsam");
        System.out.println("names = " + names);

        // 데이터 단건 조회
        String name1 = names.get(0);
        System.out.println("name1 = " + name1);

        // 데이터 삭제
        names.remove("Steve");
        System.out.println("names = " + names);

        // HashSet 사용 방법
        HashSet<String> uniqueNames = new HashSet<>();

        // 데이터 추가
        uniqueNames.add("Ilsam");
        uniqueNames.add("Steve");
        uniqueNames.add("Isac");
        uniqueNames.add("1");
        uniqueNames.add("2");

        // 순서를 보장 안함
        System.out.println("uniqueNames = " + uniqueNames);

        // get() 활용 불가
//        uniqueNames.get();

        // 중복 데이터 불가
        uniqueNames.add("Ilsam");
        System.out.println("uniqueNames = " + uniqueNames);

        // 데이터 제거
        uniqueNames.remove("Ilsam");
        System.out.println("uniqueNames = " + uniqueNames);

        // HashMap 활용
        // <키(""), 값(0)> -> 저장
        HashMap<String, Integer> memberMap = new HashMap<>();

        // 데이터 추가
        memberMap.put("Ilsam", 15);
        memberMap.put("Steve", 15);
        memberMap.put("Isac", 15);
        memberMap.put("John", 15);
        memberMap.put("Alice", 15);

        // 순서 보장 X
        System.out.println("memberMap = " + memberMap);

        // 키 중복 불가: 값이 덮어쓰기 발생
        memberMap.put("Alice", 15);
        System.out.println("memberMap = " + memberMap);

        // 단건 조회
        Integer ilsamNum = memberMap.get("Ilsam");
        System.out.println("ilsamNum = " + ilsamNum);

        // 삭제
        memberMap.remove("Ilsam");
        System.out.println("memberMap = " + memberMap);
        
        // 키 확인
        Set<String> keySet = memberMap.keySet();
        System.out.println("keySet = " + keySet);

        // 값 확인
        Collection<Integer> values = memberMap.values();
        System.out.println("values = " + values);

    }
}
