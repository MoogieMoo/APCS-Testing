public class Lamborghini {

    private String color;

    public Lamborghini() {
	super();
	color = "";
    }

    public Lamborghini( String n, String b, String p ) {
	super( n, b, p );
	color = "";
    }

    public String getName() {
	return super.getName();
    }

    public String getBrand() {
	return super.getBrand();
    }

    public int getPlate() {
	return super.getPlate();
    }

    public void setName( String s ) {
	super.setName( s );
    }

    public void setBrand( String s ) {
	super.setBrand( s );
    }

    public void setPlate( int i ) {
	super.setPlate( i );
    }

}
