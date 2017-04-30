import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

    public static void main ( String[] args ) {

	//instantiate new arrayList with no wrapper
	List one = new ArrayList();
	one.add( "uno" );
	one.add( "dos" );
	one.add( "tre" );
	//print the array
	System.out.println( one );

	//instantiate new arryList with no wrapper
	List two = new ArrayList();
	two.add( 1 );
	two.add( 2 );
	two.add( 3 );
	//print the array
	System.out.println( two );

    }

}
