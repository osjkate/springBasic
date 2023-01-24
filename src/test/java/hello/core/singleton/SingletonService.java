package hello.core.singleton;

public class SingletonService {

    // 자바 뜰 때, 생성되는 객체(딱 하나) : getInstance() 함수로만 조회할 수 있다.
    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance() {
        return instance;
    }

    // 생성자를 private으로 지정해서 외부에서 new 키워드로 객체 인스턴스를 생성할 수 없도록 막는다.
    private SingletonService() {

    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}
