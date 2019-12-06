/*
Jacob Schwab 
Java with Data Structures
Due 3/12/2018
This program is designed to read characters individually from a file and create a sring
Then the program passes that string to a class that checks the string for correct delimiter pairings using a custom Stack class
This stack class only uses the 'push,' 'pop,' and, 'isEmpty' methods from a normal stack class
The stack uses an array list specifially set to the type character for this project
I referenced an old project I have from 160 to double check my exceptions for the infile as well as the powerpoints from class to make sure the Stack was correct
*/
import java.util.Scanner;
import java.io.*;
public class Delimiter_Main 
{
  public static void main(String[] args) 
  {
     String str1 = "";
     try
      {
        Scanner infile = new Scanner(new FileInputStream("data.dat"));
         while(infile.hasNext())
         {
           str1 += infile.next();
          }
         infile.close();
      }
       catch(Exception e)
       {
         System.out.println(e.toString());//should catch any exception and print it
        }    
    DelimiterMatcher matcher = new DelimiterMatcher(str1); //passes string to the checker object
    matcher.checkMatch();
  }
}