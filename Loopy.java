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
	System.out.print( "[ " );
	for ( int x = 0; x < loop1.size(); x++ ) {
	    System.out.print( loop1.get(x) );
	    System.out.print( " " );
	}
	System.out.print( "]" );

	System.out.println( "Using for-each loop (arrayList)..." );
	System.out.println( "[" );
	for ( String s : loop1 ) {
	    System.out.print( s + " " );
	}
	System.out.println( "]" );
	
	System.out.println( "Using built-n arrayList toString..." );
	System.out.println( loop1 );

	System.out.println( "Using helper method printArray (2D array)..." );
	printArray( loop2 );

	System.out.println( "Using for-each loop (2D array)..." );
	for ( String[] b : loop2 ) {
	    for ( String s : b ) {
		System.out.print( s + " " );
	    }
	    System.out.println();
	}

    }

}
	
