public class Arrays {

    public static void main ( String[] args ) {

	//instantiate new array of length 10
	int[] a = new int[10];
	//should print one line of 10 zeros
	for ( int i = 0; i < a.length; i++ ) {
	    System.out.print( a[i] );
	    System.out.print( " " );
	}

	//instantiate new array of length 10
	int[] b = new int[10];
	//should print one line of numbers, 1 through 10
	for ( int i = 0; i < b.length; i++ ) {
	    b[i] = i + 1;
	    System.out.print( b[i] );
	    System.out.print( " " );
	}

	//instantiate new array with length of 4
	int[] c = { 1, 2, 3, 4 };
	//should print one line of numbers, 1 through 4
	for ( int i = 0; i < c.length; i++ ) {
	    System.out.print( b[i] );
	    System.out.print( " " );
	}
	System.out.pritnln( "Lenght of Array a: " + a.length );//10
	System.out.pritnln( "Lenght of Array b: " + b.length );//10
	System.out.pritnln( "Lenght of Array c: " + c.length );//4

    }

}
