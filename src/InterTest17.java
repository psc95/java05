/* 클래스 간 클래스 연결을 인터페이스를 통한 간접 연결*/
class A17{
	void autoPlay(I17 i) {//매개변수 다형성=> 상속+업캐스팅
		i.play();//업캐스팅 이후 오버라이딩 한 메서드를 호출
	}
}
interface I17{
	public abstract void play();
}
class B17 implements I17{

	@Override
	public void play() {
		System.out.println("play in B17 class");
	}
	
}

class C17 implements I17{

	@Override
	public void play() {
		System.out.println("play in C17 class");
	}
	
}
public class InterTest17 {
	public static void main(String[] args) {
		A17 a = new A17();
		a.autoPlay(new B17());
		a.autoPlay(new C17());
	}
}
