/* 인터페이스 특징)
 *  1.인터페이스에 오는 모든 변수는 public static final로 인식하는 정적상수만이 올수 있다.
 *  
 *  상수의 특징)
 *   1.일반변수를 final로 선언하면 상수가 된다.
 *   2.상수명은 관례적으로 영문대문자로 하고,선언과 동시에 최초값을 저장하는 초기화를 반드시 해야 한다.
 */
interface IColor{
	int RED = 1; //public static final이 생략된 정적상수
	public static final int GREEN = 2;//public static final 생략 가능함.
	public static final int BLUE = 3;//정적 상수
	
	void setColor(int c);//public abstract이 생략됨.
	public abstract int getColor();
}

abstract class AbsColor implements IColor{
	int color = GREEN;//추상클래스에는 color라는 일반 변수가 올수 있다.

	@Override
	public void setColor(int c) {
		color = c; 
	}
}

class SubClass15 extends AbsColor{

	@Override
	public int getColor() {
		return color;
	}
	
}

public class InterTest15 {
	public static void main(String[] args) {
		SubClass15 sub = new SubClass15();
		sub.setColor(IColor.BLUE);//상속받아서 호출
		System.out.println(sub.getColor());//3
	}
}
