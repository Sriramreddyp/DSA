public class FirstUpperCase {
 static char first(String str) {
  if (str.length() == 0)
   return ' ';
  if (Character.isUpperCase(str.charAt(0)))
   return str.charAt(0);
  else
   return first(str.substring(1, str.length()));
 }

}