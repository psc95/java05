/* 인터페이스 간의 상속문법 형식)
 *  interface 인터페이스명 extends 부모인터페이스명,부모인터페이스명{
 *  }
 */
interface Ihello{
	void hello(String name);//public abstract이 생략되었음
}

interface IGoodBye{
	public abstract void bye(String name);//public abstract이 생략가능함
}

interface ITotal extends Ihello,IGoodBye{//인터페이스는 다중상속이 가능하다.
	void greeting(String name);//추상메서드는 {}가 없고 실행문자이 없고 호출이 불가능하다
}

class SubClass14 implements ITotal{

	@Override
	public void hello(String name) {
		System.out.println(name+"씨 안녕~");
	}

	@Override
	public void bye(String name) {
		System.out.println(name+"씨 잘가세요!");
	}

	@Override
	public void greeting(String name) {
		System.out.println(name+"씨 반갑습니다.");
	}
}
public class InterTest14 {
	public static void main(String[] args) {
		SubClass14 sub = new SubClass14();
		sub.hello("홍길동");
		sub.bye("이순신");
		sub.greeting("강감찬");
	}
}
