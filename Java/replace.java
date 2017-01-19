/**
* A class that recursively replaces characters in a String.
* 
* @author H. Paul Haiduk
* @author Modified by:  Terence Wilbert
* @version 3.0
*/
public class RecursiveStringReplace
{

   /**
    * replace - replace all instances of one character by another
    * 
    * @param  s   the string to do the replacement on
    * @param  from   the character to be replaced
    * @param  to   the character to rep
    * @return     a new string with the appropriate characters replaced
    */
   public String replace(String s, char from, char to)
   {
       String result = null;

       // IMPLEMENT THIS RECURSIVE METHOD
       if (s.length() == 0)
       	return "";

       else if (s.startsWith(Character.toString(from)))
       	return to + replace(s.substring(1),from,to);
       else
       	return s.charAt(0)+ replace(s.substring(1),from,to);
   }


}