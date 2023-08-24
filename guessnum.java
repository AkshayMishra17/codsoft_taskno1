import java.util.*;

public class guessnum
{
  
public static void main (String[]args)
{
    
Scanner sc = new Scanner (System.in);
    
int originalnumber = 25;
    
int i, k = 3;
    
int score = 0;
    
System.out.println ("number of chances are only :" + k);
    
for (i = 0; i < k; i++)
      {
	
System.out.println ("enter your guess");
	
int n = sc.nextInt ();
	
if (n > originalnumber)
	  {
	    
System.out.println ("your guess is  too high");
	  
}
	else if (n < originalnumber)
	  {
	    
System.out.println ("your guess is too low");
	  
}
else
 {
	    
System.out.println ("correct answer");
	    
score++;
	  
}
      
}
    
if (i == k)
 {
	
System.out.println ("You do not have more attempts to guess the number.");
      
}
    
System.out.println ("your score is :" + score);
  
}

}
