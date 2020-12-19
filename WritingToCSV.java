import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WritingToCSV {
  public static void main(String[] args) {

    try (PrintWriter writer = new PrintWriter(new File("data.csv"))) {

        StringBuilder sb = new StringBuilder();
        sb.append("Employee Name");
        sb.append(',');
        sb.append("Employee Number");
        sb.append (',');
        sb.append ("Gender");
        sb.append (',');
        sb.append ("Date Of Birth");
        sb.append (',');
        sb.append ("Email Id");
        sb.append (',');
        sb.append ("Address");
        sb.append (',');
        sb.append ("Higher Qualification");
        sb.append (',');
        sb.append ("Department");
        sb.append (',');
        sb.append ("Hobby");
        sb.append (',');
        sb.append ("Extra-Curricular activities");
        writer.write(sb.toString());


    } catch (FileNotFoundException e) {
      System.out.println(e.getMessage());
    }

  }
}


//code written by popeye :)
