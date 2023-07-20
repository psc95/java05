// 부모 클래스와 인터페이스 혼합을 자손에서 상속받는 예제
interface IHello13{
	void sayHello(String name);//public abstract가 생략됨.
}

abstract class GoodBye13{
	public abstract void sayGoodBye(String name);//추상클래스에의 추상메서드에서 abstract생략 불가능!
}

class SubClass13 extends GoodBye13 implements IHello13{//class 자손클래스 extends 부모클래스
	//implements 부모 인터페이스
	//혼합 상속할 때는 상속받는 class를 먼저 입력해야함. 즉 extends 부모 클래스를 먼저 적어줘야 함.
	@Override
	public void sayHello(String name) {
		System.out.println(name+"씨 안녕~");
	}

	@Override
	public void sayGoodBye(String name) {
		System.out.println(name+"씨 잘가~");
	}
	
}
public class InterTest13 {
	public static void main(String[] args) {
		SubClass13 sub = new SubClass13();
		sub.sayHello("강감찬");
		sub.sayGoodBye("을지문덕");
	}
}
