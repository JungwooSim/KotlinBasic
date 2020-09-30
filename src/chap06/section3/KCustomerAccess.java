package chap06.section3;

// 자바에서 코틀린 companion 접근
public class KCustomerAccess {
    public static void main(String[] args) {
        System.out.println(KCustomer.LEVEL);
        KCustomer.login(); // @JvmStatic 을 사용할 때 접근 방법
        KCustomer.Companion.login(); // 위와 동일한 결과로 애노테이션을 사용하지 않을 때 접근 방
    }
}
