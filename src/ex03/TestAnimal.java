package ex03;

class Dog {
	String			name;
	void			eat()	{
		System.out.println(name + "(이)가 사료를 먹는다");
		
	}
	void			bark()	{
		System.out.println(name + "(이)가 멍멍");
	}
} // class Dog end

class Cat {
	String			name;
	void			eat	()	{
		System.out.println(name + "(이)가 사료를 먹는다");
	}
	void			meow ()	{
		System.out.println(name + "(이)가 야옹");
	}
} // class Cat end

public class TestAnimal {

	public static void main(String[] args) {
		Dog			chu		=	new Dog();	
		// new Dog() 생성자 호출 문장 --> 생성자가 없다? : 자바가 기본 생성자를 생성해준다
		chu.name			=	"츄";
		chu.eat();
		chu.bark();

		Cat			nero	=	new Cat();
		nero.name			=	"네로";
		nero.eat();
		nero.meow();
	} // main end

} // class TestAnimal end
