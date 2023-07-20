//18장.추상 클래스와 final.pdf No.21쪽의 2번 문제
//final로 선언된 메서드는 자손에서 더 이상 오버라이딩을 허용하지 않는다.
class A02{
	public final int method1() {
		return 0;
	}
}

class B02 extends A02{
	@Override
	public int method1() {
		return 10;
	}
}
public class Ex18_02 {
	public static void main(String[] args) {
		B02 b = new B02();
		System.out.println("x = "+b.method1());
	}
}
