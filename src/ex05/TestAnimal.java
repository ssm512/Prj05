package ex05;

abstract class Pet { // 한개이상ㅇ의 abstract 메소드가 있다면  abstract class로 만들어야 한다
	String			name;
	void			eat() {
		System.out.println(name+"(이)가 먹는다");
	}
	abstract void			sound(); 	// 함수의 {}가 없으면 abstract 필수
}

class Dog extends Pet {
	// 코딩이 없는 함수를 상속받으면 반드시 자식이 코딩을 구현 해야 한다 - 재정의(override)
	// Add uniplemented method
	@Override		// 재정의하다
	void sound() {
		System.out.println(name + "(이)가 멍멍");
	} // sound() end
	
}

class Cat extends Pet { // Pet 상속을 안 받으면 sound override 안 해도 됨
	@Override
	void sound() {
		System.out.println(name + "(이)가 야옹");		
	} // sound () end
		
}

public class TestAnimal {

	public static void main(String[] args) {
		
//		Pet 	pet			=	new Pet();	//	abstract가 있으면 new 불가능
		
		Dog		dog1		=	new	Dog();
		work(dog1, "츄");
//		dog1.name		=	"츄";
//		dog1.eat();
//		dog1.sound();

		Cat		cat1	=	new	Cat();
		work(cat1, "네로");
//		cat1.name		=	"네로";
//		cat1.eat();
//		cat1.sound();
		
	} // main end

	
	//----------------------------------------------------------------
	// 방법2. 
	// work 한개로 통일
	// 부모클래스는 자식클래스를 담을 수 없다
	// Pet pet = new Pet(); Dog dog1 = pet; // 문법오류임
	// 자식클래스는 부모클래스를 담을 수 있다
	// Pet pet = dog1;
	private static void work(Pet pet, String name) {
		pet.name	=	name;
		pet.eat();
		pet.sound();
		
	} // work (); end

	//----------------------------------------------------------------
/*
	// 방법1 : 함수의 오버로드 기능 활용
	private static void work(Dog dog1, String name) {
		dog1.name		=	name;
		dog1.eat();
		dog1.sound();
	}

	private static void work(Cat cat1, String name) {
		cat1.name		=	name;
		cat1.eat();
		cat1.sound();
	}
*/
	//----------------------------------------------------------------
		
		
	

} // class TestAnimal
