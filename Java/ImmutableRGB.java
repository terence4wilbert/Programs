//make a class immutable

final public class ImmutableRGB {

    // values must be between 0 and 255.
    final private int red;
    final private int green;
    final private int blue;
    final private String name;

    private void check(int red, int blue, int green) {
        if (red < 0 || red > 255 || green < 0 || 
            green > 255 || blue < 0 || blue > 255){
                throw new IllegalArguementException();
            }
    }

    public ImmutableRGB(int red, int blue, int green, String name){
        check(red, blue, green);
        this.red = red;
        this.blue = blue;
        this.green = green;
        this.name = name;
    }

    public int getRGB(){
        return ((red << 16) | (green << 8) | blue);
    }

    public String getName(){
        return name;
    }

    public ImmutableRGB invert() {
        return new ImmutableRGB( 255 - red, 255 - green, 255 - blue, 
                                "Inverse of " + name);
    }

}