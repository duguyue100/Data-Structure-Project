
public class MemberTest {
	public static void main(String[] args)
	{
		Member<String> m1=new Member("ID111");
		Member<Integer> m2=new Member(3900);
		
		//test getId
		System.out.println(m1.getId());
		System.out.println(m2.getId());
		
		System.out.println("---------------------");
		
		//test toString
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		
		System.out.println("---------------------");
		
		//test setId
		m1.setId("ID112");
		m2.setId(3901);
		System.out.println(m1.getId());
		System.out.println(m2.getId());
	}
}
