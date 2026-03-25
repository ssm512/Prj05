package ex02;

class Member {
	// Feild : data
	String		name;
	String		uid;
	String		email;
	int			regYear;
	
	// 기본 생성자, new 할떄 실행되는 거
	public Member() {}
	
	// 인자 있는 생성자
	public Member(String n, String u, String e, int r) {
		name			=	n;
		uid				=	u;
		email			=	e;
		regYear			=	r;
	}
	
	// Method : 기능
	void info() {
		String		fmt	=	"이름 : %s\n아이디 : %s\n이메일 : %s\n연도 : %d\n";
							 
		String		msg	=	String.format(fmt, name, uid, email, regYear);
		System.out.println( msg );		
	}
}

public class TestMember {

	public static void main(String[] args) {
		Member			m1		=	new	Member();		// m1을 인스턴스라 부름 -> 이줄이 실행 될때, Member m1 은 stack에 m1 만들어짐, new -> Heap에 m1 Member객체가 만들어짐
		m1.name					=	"사나";				//	m1 Member 객체 data가 들어감
		m1.uid					=	"sana";
		m1.email				=	"sana@hive.com";
		m1.regYear				=	2009;
		m1.info();
		
		Member			m2		=	new	Member();
		m2.name					=	"정연";
		m2.uid					=	"jungyeon";
		m2.email				=	"jungyeon@hive.com";
		m2.regYear				=	2011;
		m2.info();

		Member			m3		=	new	Member();
		m3.name					=	"나연";
		m3.uid					=	"nayeon";
		m3.email				=	"nayeon@hive.com";
		m3.regYear				=	2007;
		m3.info();
		
		System.out.println("--------------------------");
		/*
		// Member 배열에 저장, 이식성이 높아짐
		Member	[]		mList	=	new	Member[3];	//	mList라는 member 3개짜리 배열를 만드는데 // 배열 생성
		mList[0]				=	new Member();	// mList [0]째에 새 Member 			// 배열안에 저장할 Member 생성
		mList[0].name 			=	"사나";			// data 넣고
		mList[0].uid 			=	"sana";
		mList[0].email 			=	"sana@hive.com";
		mList[0].regYear		=	2009;
		*/
		
		// 
		Member	[]		mList	=	new	Member[3];		//	배열 생성
		mList[0]				=	new Member("사나", "sana", "sana@hive.com", 2009);
		mList[1]				=	new Member("정연", "jungyeon", "jungyeon@hive.com", 2021);
		mList[2]				=	new Member("미나", "mina", "minna@hive.com", 2019);
		mList[0].info();
		mList[1].info();
		mList[2].info();
		
		
	} // main end

} // class end
