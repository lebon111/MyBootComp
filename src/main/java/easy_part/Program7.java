package easy_part;

public class Program7 {
	public static void main(String[] args) {    
        String string = "New York";        
        String reversedText = "";        
        for(int i = string.length()-1; i >= 0; i--){    
        	reversedText = reversedText + string.charAt(i);    
        }    
            
        System.out.println("Original string: " + string);       
        System.out.println("Reverse of given string: " + reversedText);    
    }    

}
