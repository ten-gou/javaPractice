import java.io.*;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner inFile = new Scanner(new FileReader("EmployeeDistribution/lib/Q3_Data.txt"));
        PrintWriter outFile = new PrintWriter("Q3_Output.txt");

        LineNumberReader reader = null;
        try {
          reader = new LineNumberReader(new FileReader(new File("EmployeeDistribution/lib/Q3_Data.txt")));
          // Read file till the end
          while ((reader.readLine()) != null);
          System.out.println("Count of lines - " + reader.getLineNumber());
        } catch (Exception ex) {
          ex.printStackTrace();
        } finally { 
          if(reader != null){
            try {
              reader.close();
            } catch (IOException e) {
              // TODO Auto-generated catch block
              e.printStackTrace();
            }
          }
        }

        //splits the strings into words based on the spaces
        for (int i= 0 ; i < reader.getLineNumber() ; i++) {
            String employeeData = inFile.nextLine();
            System.out.println("Student Name: " + employeeData);
            String[] splitted = employeeData.split(" ");

            double currentSalary = Double.parseDouble(splitted[2]);
            double payIncrease = (Double.parseDouble(splitted[3])/100) + 1;
    
            double updatedSalary = currentSalary * payIncrease;
            
            String outputString = splitted[1] + " " + splitted[0] + " " + updatedSalary + System.lineSeparator();

            outFile.printf(outputString);
        }

        inFile.close();
        outFile.close();
    }

}