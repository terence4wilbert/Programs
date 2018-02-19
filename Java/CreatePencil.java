public class CreatePencil {
    public static void main (String args[]){
        //creating a new object of pencil
        Pencil p1 = new Pencil();
        Pencil p2 = new Pencil();
        
        p1.length = 5;
        p2.length = 6;

        p1.color = "Blue";
        System.out.println(p1.color);
        System.out.println(p2.color);
        
        p2.setColor("Green", 5);
        System.out.println(p2.getColor());

    }
}