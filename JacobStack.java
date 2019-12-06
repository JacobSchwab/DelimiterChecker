import java.util.ArrayList;
public class JacobStack<Character> 
{
 private ArrayList<Character> list = new ArrayList<Character>();
 
   public Character pop() 
   {
    if (isEmpty())
    throw new java.util.EmptyStackException();
    return list.remove(list.size()-1);
   }

  public void push(Character ch) 
   {
   list.add(ch);
   }

  public boolean isEmpty() 
   {
   return list.isEmpty();
   }

}