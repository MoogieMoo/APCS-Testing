public abstract class RaceCar implements Car {

    private String name;
    private String brand;
    private int plate;

    public RaceCar() {
	name = "";
	brand = "";
	plate = 0;
    }

    public RaceCar( String n, String b, int p ) {
	name = n;
	brand = b;
	plate = p;
    }

    public String getName() {
	return name;
    }

    public String getBrand() {
	return brand;
    }

    public int getPlate() {
	return plate;
    }

    public void setName( String s ) {
	name = s;
    }

    public void setBrand( String s ) {
	Brand = s ;
    }

    public void setPlate( int i ) {
	Plate = i ;

    }

}
