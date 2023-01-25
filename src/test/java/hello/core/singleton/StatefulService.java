package hello.core.singleton;

public class StatefulService {
//    private int price; //상태를 유지하는 필드

    public int order(String name, int price) {
        System.out.println("name = " + name + " price = " + price);
//        this.price = price; // 여기가 문제 : 공유되는 필드의 값을 바꿔버림
        return price;
    }

//    public int getPrice() {
//        return price;
//    }
}
