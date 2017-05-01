import java.util.List;
import java.util. ArrayList;

public class Loopy {

    public static void printArray( String[][] array ) {
	for ( int i = 0; i < array.length; i++ ) {
	    for ( int j = 0; j < array[i].length; j++ ) {
		System.out.print( array[i][j] + " " );
	    }
	    System.out.println();
	}
    }
    
    public static void main ( String[] args ) {

	List<String> loop1 = new ArrayList(7);
	loop1.add( "Sunday" );
	loop1.add( "Monday" );
	loop1.add( "Tuesday" );
	loop1.add( "Wednesday" );
	loop1.add( "Thursday" );
	loop1.add( "Friday" );
	loop1.add( "Saturday" );
	String[][] loop2 = { { "cat", "bat", "mat" },
			     { "cow", "bow", "mow" },
			     { "cod", "bod", "mod" } };

	System.out.println( "Using for loop (arrayList)..." );
	String print1 = "[";
	for ( int x = 0; x < loop1.size(); x++ ) {
	    print1 += loop1.get(x);
	    print1 += " ";
	}
	print1 = print1.substring( 0, print1.length() - 1 );
	print1 += "]";
	System.out.println( print1 );
	System.out.println();

	System.out.println( "Using for-each loop (arrayList)..." );
	String print2 = "[" ;
	for ( String s : loop1 ) {
	    print2 += s;
	    print2 += " ";
	}
	print2 = print2.substring( 0, print2.length() - 1 );
	print2 += "]";
	System.out.println( print2 );
	System.out.println();
	
	System.out.println( "Using built-n arrayList toString..." );
	System.out.println( loop1 );
	System.out.println();

	System.out.println( "Using helper method printArray (2D array)..." );
	printArray( loop2 );
	System.out.println();

	System.out.println( "Using for-each loop (2D array)..." );
	for ( String[] b : loop2 ) {
	    for ( String s : b ) {
		System.out.print( s + " " );
	    }
	    System.out.println();
	}

    }

}
	
