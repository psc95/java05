/* 1.클래스나 추상클래스는 하나의 조상으로 부터 단일 상속만 가능하다.
 * 2.클래스나 추상클래스는 하나 이상의 조상으로 부터 다중 상속은 안된다.
 */
abstract class Hello11{//extends Object이다
	public abstract void sayHello(String name);//추상클래스에서 추상메서드의 abstract은 생략 못함.
}

abstract class GoodBye11{
	public abstract void sayGoodBye(String name);
}

class SubClass11 extends GooBye11, Hello11{
	//클래스는 하나이상의 부모로 부터 다중 상속은 불가능하다.
	//다중상속을 받으려면 interface를 사용해야 함.
}
public class InterTest11 {
	public static void main(String[] args) {

	}
}
