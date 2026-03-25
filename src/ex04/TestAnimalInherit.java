package ex04;

class	Pet	{
	String			name;
	void			eat()	{
		System.out.println(name + "(이)가 사료를 먹는다");
	}
} // class Pet end

class Dog extends Pet {		//	Dog = Pet + Dog
	void			bark()	{
		System.out.println(name + "(이)가 멍멍");
	}
} // class Dog end

class Cat extends Pet {
	void			meow ()	{
		System.out.println(name + "(이)가 야옹");
	}
} // class Cat end

class Tiger	extends Pet {
	void			cry() {
		System.out.println(name + "(이)가 어흥");
	}
} // class Tiger end

public class TestAnimalInherit {
	
	// 상속 : Inherit -> java에서는 extends로 처리
	// 다중상속 불가능, 상속은 한개만 가능 -> java, c#
	public static void main(String[] args) {
		
		Dog		dog		=	new Dog();
		work(dog,"츄");
		
//		dog.name		=	"츄";
//		dog.eat();
//		dog.bark();
		System.out.println("---------");

	
		Cat			nero	=	new Cat();
		work(nero,"네로");
//		nero.name			=	"네로";
//		nero.eat();
//		nero.meow();
		System.out.println("---------");

		Pet		pet			=	new Pet();
		pet.name			=	"뻐끔이";
		pet.eat();
//		pet.bark();	//	error	
//		pet.meow();	//	error
		System.out.println("==========");
		
		Tiger	tiger		=	new Tiger();
		work(tiger, "큰냥이");
	} // main end

	// 한개의 work() 함수로 업무 처리
	// 방법2
	private static void work(Pet pet, String name) {
		pet.name			=	name;
		System.out.println("work:");
		pet.eat();
		
		if (pet instanceof Dog)
			((Dog) pet).bark();
		if (pet instanceof Cat)
			((Cat) pet).meow();
		if (pet instanceof Tiger)
			((Tiger) pet).cry();
	} // work() 함수 생성

	
/*
 	// 방법 1
	private static void work(Cat nero, String name) {
		nero.name			=	name;
		System.out.print("work:");
		nero.eat();
		nero.meow();
		System.out.println("**");
		
	} // Cat의 work 생성

	private static void work(Dog dog, String name) {
		dog.name			=	name;
		System.out.print("work:");
		dog.eat();
		dog.bark();
		System.out.println("*");
	} // work method 생성
*/
} // class TestAnimalInherit
