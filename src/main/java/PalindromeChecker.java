import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class PalindromeChecker {
public void tester()
{
  //String lines[] = loadStrings("palindromes.txt");
  String[] lines = new String[6]; 
    try{
        File myFile = new File("palindromes.txt");
        Scanner myReader = new Scanner(myFile);
        int counter = 0;
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            lines[counter] = data;
            counter++;
        }
        myReader.close();
    }
    catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }
  System.out.println("there are " + lines.length + " lines");
  for (int i=0; i < lines.length; i++) 
  {
    if(palindrome(lines[i])==true)
    {
      System.out.println(true);
    }
    else
    {
      System.out.println(false);
    }
  }
}
public boolean palindrome(String str)
{
      str.toLowerCase();
      String result="";
      for(int i = 0; i < str.length(); i++){
     if(!str.substring(i,i+1).equals(" ")){
       result=result + str.substring(i,i+1);
     }
      }
     String result1 ="";
   for(int i = 0; i < result.length(); i++){
    if(Character.isLetter(result.charAt(i))){
      result1 = result1 + result.substring(i,i+1);
    }
   }
  String reverse = ""; 
          for (int i = result1.length() - 1; i >= 0; i--) {
            reverse = reverse+ result1.substring(i,i+1);
        }
        return reverse==result1;
}
}
