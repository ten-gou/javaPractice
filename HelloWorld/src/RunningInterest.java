import java.io.*;
import java.util.*;

public class RunningInterest {
    public static void main(String[] args) throws Exception {
        Scanner inFile = new Scanner(new FileReader("lib/RunningInterestInput.txt"));
        PrintWriter outFile = new PrintWriter("lib/RunningInterestOutput.txt");

        LineNumberReader reader = null;
        try {
          reader = new LineNumberReader(new FileReader(new File("lib/RunningInterestInput.txt")));
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
            String accountData = inFile.nextLine();
            String[] splited = accountData.split(" ");

            int accID = Integer.parseInt(splited[0]);
            String accType = AccountType(splited[1].toLowerCase());
            double minBalance = Integer.parseInt(splited[2]);
            double curBalance = Integer.parseInt(splited[3]);
            int interest;
            if (accType.equals("Savings")) {
                interest = 4;
            }
            else if (accType.equals("Checking")) {
                if (curBalance > 5000 + minBalance) {
                    interest = 3;
                }
                else {
                    interest = 5;
                }
            }
            else {
                interest = 0;
            }
            
            double interestAmount = curBalance * interest/100;
        
            if (curBalance > minBalance) {
                String outputString = accID + ", a " + accType + " account, has a current balance of " + curBalance + " and has accrued an interest of " + interestAmount + ", bringing it to " + (curBalance + interestAmount) + "." + System.lineSeparator();
                System.out.println(outputString);
                outFile.printf(outputString);
            }
            else {
                String outputString = accID + ", a " + accType + " account, has a current balance of " + curBalance + ". It does not have enough money to accrue interest." + System.lineSeparator();
                System.out.println(outputString);
                outFile.printf(outputString);
            }
        }

        inFile.close();
        outFile.close();
    }

    public static String AccountType(String x) {
        if (x.equals("s")) {
            String Type = "Savings";
            return Type;
        }
        else if (x.equals("c")) {
            String Type = "Checking";
            return Type;
        }
        else {
            String Type = "Undefined";
            return Type;
        }
    }
}
