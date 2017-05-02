public class Lamborghini extends RaceCar {

    private String color;

    public Lamborghini() {
	super();
	color = "";
    }

    public Lamborghini( String n, String b, int p ) {
	super( n, b, p );
	color = "";
    }

    public String getColor() {
	return color;
    }

    public void setColor( String s ) {
	color = s;
    }

}
