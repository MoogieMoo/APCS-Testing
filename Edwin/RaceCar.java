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

    public abstract String getName();

    public abstract String getBrand();

    public abstract int getPlate();

    public abstract void setName( String s );

    public abstract void setBrand( String s );

    public abstract void setPlate( int i );

}
