public class Pencil {
    public String color = "red";
    public int length;
    public float diameter;
    // private because it is an accessor
    private float price;

    public static long nextID = 0;

    public void setPrice (float newPrice){
        price = newPrice;
    }

    public void setColor(String myColor, int k){
        color = myColor;
        length = k;
    }

    public String getColor(){
        return color;
    }
}