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

	//instantiate new arrayList with no wrapper
	List two = new ArrayList();
	two.add( 1 );
	two.add( 2 );
	two.add( 3 );
	//print the array
	System.out.println( two );
	//using add-at overridden add method to insert a zero at index 0
	two.add( 0, 0 );
	System.out.println( two );
	two.set( 2, 9 );//changes value at index 2 (2) to 9
	two.set( 3, 5 );//changes value at index 3 (3) to 5
	System.out.println( two );
	    
	//instantiate new arrayList String wrapper
	List<String> three = new ArrayList<String>();
	three.add( "yee" );
	three.add( "err" );
	three.add( "san" );
	//print the array
	System.out.println( three );
	//using add-at overridden add method to insert "lng" at index 0
	three.add( 0, "lng" );
	three.set( 1, "eie" );//changes value at index 1 to  "eie"
	three.set( 3, "sam" );//changes value at index 3 to "sam"
	System.out.println( three );

    }

}
