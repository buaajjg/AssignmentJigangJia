import java.util.TreeSet;

public class Person implements Comparable<Object> {
	public static void main(String [] args)
	{
		Person a= new Person("Jimmy","Handson");
		Person b= new Person();
		Person c= new Person();
		System.out.println(a);
		System.out.println(b);
		
		b.setFirstName("Jigang");
		b.setLastName("Jia");
		c.setFirstName("Hally");
		c.setLastName("Jia");
		TreeSet<Person> tree1= new TreeSet<>();
		TreeSet<Person> tree2= new TreeSet<>();
		tree1.add(a);
		tree1.add(b);
		tree1.add(a);
		System.out.println(tree1);
		tree2.add(b);
		tree2.add(a);
		tree2.add(c);
		System.out.println(tree2);
		
		c.setFirstName("Jimmy");
		c.setLastName("Handson");
		
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(c.hashCode());
		System.out.println(tree2);
		
	}
	private String firstName;
	private String lastName;
	
	Person(String f,String l)
	{
		this.setFirstName(f);
		this.setLastName(l);
	}
	
	Person()
	{
	}
	
	public String getFirstName()
	{
		return this.firstName;
	}
	public String getLastName()
	{
		return this.lastName;
	}
	public void setFirstName(String firstName)
	{
		this.firstName=firstName;
	}
	public void setLastName(String lastName)
	{
		this.lastName=lastName;
	}
	
	@Override
	public int compareTo(Object o)
	{
		Person p=(Person)o;
		if(this.hashCode()>p.hashCode())
		{
			return 1;
		}
		if(this.hashCode()<p.hashCode())
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
	
	@Override
	public int hashCode()
	{	String name=this.getFirstName()+this.getLastName();
		int code=0;
		for(int i=1;i<name.length()+1;i++)
		{
			code=3*code+name.codePointBefore(i);
		}
		return code;
	}
	
	@Override
	public boolean equals(Object o)
	{	Person p=(Person)o;
		if (this.getFirstName().equals(p.getFirstName())&&this.getLastName().equals(p.getLastName()))
		{
			return  true;
		}
		else
		{
			return false;
		}
	}
	@Override
	public String toString()
	{
		return (this.getFirstName()+" "+this.getLastName());
	}
	
}
