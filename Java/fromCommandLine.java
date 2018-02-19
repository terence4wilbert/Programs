import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class fromCommandLine{
    public String selectAll(String in, String ins){
        // System.out.println("SELECT * FROM " + in + " WHERE column like " + "'%" + ins + "%'");
        return "SELECT * FROM " + in + " WHERE column like " + "'%" + ins + "%'";
    }
    public static void main(String[] arg){
        String in1 = arg[0];
        String in2 = arg[1];
        String localtimes = "";
        if (in1.equals("-c"))
            localtimes = "(Date)(LocalDateTime.now())";
        else if (in1.equals("-d"))
            localtimes = "Made a damn discovery";

        
        System.out.println("You entered at the line: " + localtimes +  " and  " + in2);


        fromCommandLine commands = new fromCommandLine();
        System.out.println(commands.selectAll("Q2_home", "Tax"));
    }
}