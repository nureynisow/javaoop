import java.io.IOException;
 
public class App{
    public static void main(String[] args) {
        System.out.println("Type a letter : ");
        char c;        
        try { 
			c = (char) System.in.read();
		} catch (IOException e) { 
            return;
		}
        if(c == 'A' || c == 'a'){
            System.out.println("you got an A");
        } else if(c == 'B' || c == 'b'){
            System.out.println("You got an B");
        }else {
            System.out.println("Play again with A or B");
        }
    }
}