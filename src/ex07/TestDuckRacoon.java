package ex07;

interface Duck {
	void		swim();
}

interface Racoon {
	void		dig();
}

class DuckRacoon implements Duck, Racoon {

	@Override
	public void dig() {
		System.out.println("땅을 판다");
		
	} // dig() end

	@Override
	public void swim() {
		System.out.println("헤엄친다");
		
	} // swim() end

	
}

public class TestDuckRacoon {

	public static void main(String[] args) {
		
		DuckRacoon 	dr	=	new DuckRacoon();
		dr.dig();
		dr.swim();
		System.out.println(dr.hashCode()); // heap memory의 주소(위치)
		System.out.println(dr.toString()); // dr instance의 정보를 문자열로 바꿔서 보여줘
		System.out.println(dr.getClass()); // dr의 class
		
		// 모든 자바의 class는 object class를 상속받아서 만들어졌다.
		// 그래서 instance.[ctrl+spacebar] 하면 6가지 함수가 나오는 거임
		Object		obj		=	new Object();
		System.out.println(obj.hashCode()); // heap memory의 주소(위치)
		System.out.println(obj.toString()); // obj instance의 정보를 문자열로 바꿔서 보여줘 //java.lang.Object@764c12b6 (@뒤는 heap memory 위치를 16진수로)
		System.out.println(obj.getClass()); // obj의 class // class java.lang.Object
		
		
		
	} // main end

} // class TestDuckRacoon end
