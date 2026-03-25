package ex06;

//오리
class Duck {
	void		swim() {
		System.out.println("헤엄을 칩니다");
	}
} // class Duck end

//너구리 - 코드없는 함수로 구현
// 모든항목이 abstract 인 abstract class는 interface 문법으로 변경 가능하다 
// extends 클래스 implements 인터페이스1, 인터페이스2, ...
/*
abstract class Racoon { // -> interface로 변경
	abstract void		dig();
} // class Racoon end
*/
interface Racoon { 
	void		dig();
} // interface Racoon end



//오리너구리 = 오리 + 너구리
/*
class DuckRacoon extends Duck, Racoon { // 다중 상속 불가능 : 에러 } // class DuckRacoon end
*/
class DuckRacoon extends Duck implements Racoon {
	@Override
	public void dig() {
		System.out.println("땅을 판다");
	}
}

public class TestDuckRacoon {

	public static void main(String[] args) {
		
		DuckRacoon		dr	=	new	DuckRacoon();
		dr.swim();
		dr.dig();
	} // main end

} // class TestDuckRacoon end
