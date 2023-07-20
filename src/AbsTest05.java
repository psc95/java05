import com.naver.model01.ShapeClass;
import com.naver.model02.Circ;
import com.naver.model02.Rect;
import com.naver.model02.Tria;

public class AbsTest05 {
	public static void main(String[] args) {

		Circ c = new Circ();
		Rect r = new Rect();
		Tria t = new Tria();
		
		c.draw(); r.draw(); t.draw();
		System.out.println("================================>");
		
		ShapeClass ref;//부모 추상클래스로 참조변수 선언
		ref = new Circ();//업캐스팅
		ref.draw();//업캐스팅 이후 오버라이딩 한 메서드 호출
		
		ref = new Rect();
		ref.draw();
		
		ref = new Tria();
		ref.draw();
	}
}
