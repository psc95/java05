import com.naver.model01.ShapeClass;
import com.naver.model02.Circ;
import com.naver.model02.Rect;
import com.naver.model02.Tria;

public class AbsTest06 {
	static void income(ShapeClass ref) {//매개변수 다형성=상속+업캐스팅. 결국 모든 자손타입을 다 받을 수 있다.
		//그만큼 코드라인을 줄이고 불필요한 메서드 오버로딩을 안하게 해준다.
		ref.draw();
	}
	
	static void income2(Circ c) {
		c.draw();
	}
	static void income2(Rect r) {//매개변수 다형성을 사용하지 않아서 자손클래스 개수만큼 전달인자 타입이 다른
		//메서드 오버로딩을 해야 한다.
		r.draw();
	}
	
	static void income2(Tria t) {//불필요한 메서드가 계속해서 반복된다.
		t.draw();
	}
	
	public static void main(String[] args) {
		
		ShapeClass[] arr = new ShapeClass[3];//배열크기가 3인 객체배열 arr생성
		arr[0] = new Circ();//업캐스팅
		arr[1] = new Rect();
		arr[2] = new Tria();
		
		for(int i = 0; i < arr.length; i++) {
			arr[i].draw();
		}
		System.out.println("\n===========================>");
		Circ c = new Circ(); Rect r = new Rect(); Tria t = new Tria();
		income(c); income(r); income(t);
		System.out.println("\n===========================>");
		
		income2(new Circ()); income2(new Rect()); income2(new Tria());
	}

	
}
