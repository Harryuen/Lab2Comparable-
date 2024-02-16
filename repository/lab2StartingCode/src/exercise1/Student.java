package exercise1;

import java.util.Comparator;

public class Student implements Comparable<Student>
{
	private String name;
	private int age;
	
	public Student( String name, int age )
	{
		this.name = name;
		this.age = age;
	}
	
	public String getName()
	{
		return name;
	}

	public int getAge()
	{
		return age;
	}
	
	public int compareTo( Student that )
	{
		if( this.age > that.age )
		{
			return 1;
		}
		else if( this.age < that.age )
		{
			return -1;
		}
		else 
		{
			Comparator<Student> nameComparator = new NameCompare();
            return nameComparator.compare(this, that);
		}
	}
}
