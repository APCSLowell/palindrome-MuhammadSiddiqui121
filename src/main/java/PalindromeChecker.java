public void setup()
{
  String lines[] = loadStrings("palindromes.txt");
  System.out.println("there are " + lines.length + " lines");
  for (int i=0; i < lines.length; i++) 
  {
    if(palindrome(lines[i])==true)
    {
      System.out.println(lines[i] + " IS a palindrome.");
    }
    else
    {
      System.out.println(lines[i] + " is NOT a palindrome.");
    }
  }
}
public boolean palindrome(String word)
{
  String a = onlyLetters(word).toLowerCase();
  if(a.equals(reverse(a))){
    return true;
  }
  return false;
}
public String reverse(String str)
{
     String sNew = new String();
    for(int i = str.length(); i > 0; i--){
    sNew += str.substring(i-1, i);
  }
    return sNew;
}

public String onlyLetters(String sString){
  String a = "";
  for(int i = 0; i < sString.length(); i++){
    if(Character.isLetter(sString.charAt(i))){
      a += sString.charAt(i);
    }
    
  }
  return a;
}

