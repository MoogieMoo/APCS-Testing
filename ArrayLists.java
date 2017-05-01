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
	System.out.println( "ArrayList one: " );
	System.out.println( one );

	//instantiate new arrayList with no wrapper
	List two = new ArrayList();
	two.add( 1 );
	two.add( 2 );
	two.add( 3 );
	//print the array
	System.out.println( "ArrayList two: " );
	System.out.println( two );
	System.out.println( "Using overridden add method to insert a zero at index 0..." );
	two.add( 0, 0 );
	System.out.println( two );
	System.out.println( "Change value at index 2 to 9..." );
	two.set( 2, 9 );
	System.out.println( "Change value at index 3 to 5..." );
	two.set( 3, 5 );
	System.out.println( two );
	    
	//instantiate new arrayList String wrapper
	List<String> three = new ArrayList<String>();
	three.add( "yee" );
	three.add( "err" );
	three.add( "san" );
	//print the array
	System.out.println( "ArrayList three: " );
	System.out.println( three );
	//using add-at overridden add method to insert "lng" at index 0
	System.out.println( "Using overridden add method to insert \"lng\" at index 0..." );
	three.add( 0, "lng" );
	System.out.println( "Change value at index 3 to \"eie\"..." );
	three.set( 1, "eie" );
	System.out.println( "Change value at index 3 to \"sam\"..." );
	three.set( 3, "sam" );
	System.out.println( three );

	//instantiate new arrayList with no wrapper
	List<Integer> four = new ArrayList<Integer>();
	four.add( 1 );
	four.add( 7 );
	four.add( 6 );
	//print the array
	System.out.println( "ArrayList four: " );
	System.out.println( four );
	System.out.println( "Using overridden add method to insert a zero at index 0..." );
	four.add( 0, 4 );
	System.out.println( four );
	System.out.println( "Change value at index 2 to 9..." );
	four.set( 2, 9 );
	System.out.println( "Change value at index 3 to 5..." );
	four.set( 3, 5 );
	System.out.println( four );
       
    }

}
