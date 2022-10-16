public class ReverseString {
 public String reverse(String str) {
  if (str.isEmpty())
   return str;
  else
   return str.charAt(str.length() - 1) + reverse(str.substring(0, str.length() - 1));
 }

}