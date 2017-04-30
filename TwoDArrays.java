public class TwoDArrays {

    //helper method for displaying arrays
    public static void printArray( int[][] array ) {
	for ( int i = 0; i < array.length; i++ ) {
	    for ( int j = 0; j < array[0].length; j++ ) {
		System.out.print( array[i][j] );
	    }
	    System.out.print( "\n" );
	}
	
    }

    public static void main ( String[] args ) {
	
	//instantiate new 2D array
	int[][] a = new int[4][4];
	System.out.println( "2DArray a: " );
	printArray( a );
	

	//instantiate new 2D array
	System.out.println( "2DArray b: " );
	int[][] b = { { 1, 2, 3 },
		      { 4, 5, 6 },
		      { 7, 8, 9 }, };
	printArray( b );

	System.out.println( "Array b's #rows: " + b.length );
	System.out.println( "Array b's #cols: " + b[0].length );

    }

}
