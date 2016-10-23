import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 */

/**
 * @author Mohsen
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello ASE2016 - how are you now? :)");
		System.out.print("Please enter your name: ");
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		HelloUser user;
		try{
			String name = buf.readLine();
			user= new HelloUser(name);
		}
		catch (IOException ioe){
			System.err.println("Error!");
			return;
		}
		user.greetUser();
	}

}
