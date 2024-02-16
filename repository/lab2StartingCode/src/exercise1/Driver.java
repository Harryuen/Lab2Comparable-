package exercise1;

import java.util.ArrayList;
import java.util.Collections;

public class Driver
{

	public static void main( String[] args )
	{

		ArrayList<Student> studs = new ArrayList<>();
		studs.add( new Student( "Smith", 34 ) );
		studs.add( new Student( "Johnson", 21 ) );
		studs.add( new Student( "Williams", 67 ) );
		studs.add( new Student( "Brown", 53 ) );
		studs.add( new Student( "Jones", 48 ) );
		studs.add( new Student( "Miller", 36 ) );
		studs.add( new Student( "Davis", 44 ) );
		studs.add( new Student( "Wilson", 52 ) );
		studs.add( new Student( "Anderson", 34 ) );
		studs.add( new Student( "Moore", 33 ) );
		
		// using the Comparable compareTo() method of the Student class
		System.out.println( "Sort by Age and then Name: " );
		Collections.sort( studs ); // 
		for( Student s : studs )
		{
			System.out.println( "\t" + s.getName() + " " + s.getAge() );
		}

	}
	
}
