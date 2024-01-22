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
public boolean palindrome(String word)
{
  for(int i=0; i<word.length(); i++){
  }
  return false;
}
public String noCapitals(String str)
{
      str.toLowerCase();
      for(int i = 0; i < str.length(); i++){
     if(!str.substring(i,i+1).equals(" ")){
       result=result + str.substring(i,i+1);
     }
   for(int i = 0; i < result.length(); i++)
    if(Character.isLetter(result.charAt(i)))
      result1 = result1 + result.substring(i,i+1);
  return result1;
}
}
