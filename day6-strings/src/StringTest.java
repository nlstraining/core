
public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String string = new String("Hello from Strings");
		   String str = new String(string);
          System.out.println(str);
          
          char chars[] = new char[4];
          
          chars[0] ='J';
          chars[1]='A';
          chars[2] ='V';
          chars[3]='A';
          
          String lang = new String(chars);
          System.out.println(lang);
          System.out.println(lang.length());
          
          System.out.println(lang.toLowerCase());
          String email="anil4java2@gmail.com";
          char mail[]= email.toCharArray();
          email = new String(mail);
          // foreach loop 
          for(char c : mail){
        	  
        	       if(email.charAt(11) == c)
        	                           System.out.println("found @ at "+ email.indexOf("@"));
          }
          
	}

}
