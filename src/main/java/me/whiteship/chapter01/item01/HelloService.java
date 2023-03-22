package me.whiteship.chapter01.item01;

/**
 * java8부터는 인터페이스에 디폴트메소드 구현 가능
 */
public interface HelloService {

    String hello();

    static String hi() {
        prepareMessage();
        return "hi";
    }

    static private void prepareMessage() {
    }

    static String hi1() {
        prepareMessage();
        return "hi";
    }

    static String hi2() {
        prepareMessage();
        return "hi";
    }

    default String bye() {
        return "bye";
    }
}
