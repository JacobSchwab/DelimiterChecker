class DelimiterMatcher 
{
  String str1;
  public DelimiterMatcher (String infile) 
  {
    str1 = infile;
  }
  public void checkMatch() 
  {
    boolean isTrue = true;
    boolean pushed = false; //used to check if any data was pushed to stack
    JacobStack<Character> myStack = new JacobStack<Character>();
    for (int i = 0; i < str1.length(); i++) 
    {
      char del = str1.charAt(i);
      switch (del) //only pushes the specified characters not letters, numbers, other symbols, etc 
      {
        case '{': 
        case '[':
        case '(':
        case '<':
          myStack.push(del);
          pushed = true;
          break;
        
        case '}': 
        case ']':
        case ')':
        case '>':
        
           if (!myStack.isEmpty()) //only for the 'right' side delimiters
             {
               char delp = myStack.pop(); //pops a value and sets it to delp
          
                  if (del == '}' && delp != '{')
                     isTrue = false;
                  else if (del == ']' && delp != '[')
                     isTrue = false;
                  else if (del == ')' && delp != '(')
                     isTrue = false;
                  else if (del == '>' && delp != '<')
                     isTrue = false;
               }
           else //if myStack.isEmpty
                isTrue = false;
        //if none of the logic trips, isTrue should still be true, therefore indicating a correct string was entered
      break;
      }//end switch
    }//end for loop
    //print line statements
    if (!myStack.isEmpty() || !isTrue)
     {
      System.out.println("False");
     }
    
    if (str1.length() == 0)
     {
       System.out.println("The input data file was empty. Please check that the \"data.dat\" file has contents!");
     }

    if (!pushed && str1.length() != 0)
     {
      System.out.println("No delimiters were pushed, does \"data.dat\" contain any?");
     }
     
     if (myStack.isEmpty() && isTrue && str1.length() != 0 && pushed)
     {
      System.out.println("True");
     }

  }
}