public class count{
    String arv="";
	public count(){

	}
	public count(String arvo){
       arv=arvo;
	}
	public void print()
	{
		System.out.println("string original: "+ arv);
	}
	public void countWords()
	{
	   int wordCount = 0;
       boolean word = false;
       int endOfLine = arv.length() - 1;

       for (int i = 0; i < arv.length(); i++) {
          if (Character.isLetter(arv.charAt(i)) && i != endOfLine) {
             word = true;
          } 
          else if (!Character.isLetter(arv.charAt(i)) && word) {
             wordCount++;
             word = false;
          } 
          else if (Character.isLetter(arv.charAt(i)) && i == endOfLine) {
             wordCount++;
          }
       }   
       System.out.println("Sanojen maara "+wordCount);
    }
	public void reverse()
	{
	   int ind=0;
	   String kaannetty="";
       
       ind=arv.length();
	   for(int i = ind - 1 ;i >= 0; i--){
	      kaannetty=kaannetty + arv.charAt(i);
	   }
	   System.out.println("string reverse: "+ kaannetty);
	}

public static void main(String[] args) {
   int maara=0;
   count kaksi=new count("laske sanojen maara tassa lauseessa");
   kaksi.print(); //print original sentence
   kaksi.countWords();
   kaksi.reverse();
   }
}   