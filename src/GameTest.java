import java.util.*;
public class GameTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String testNum = null;
		String loadName = null;
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		testNum = s.next();
		//System.out.println(testNum);
		System.out.print("hello, Print Name: ");
		
		Scanner s1 = new Scanner(System.in);
			CharacterType Ninja = new CharacterType();
			Ninja.setName(s1.next());
		if(testNum.compareTo("0")==0){
			
			//System.out.println(Ninja.getName());
			Ninja.setLevel(10);
			//System.out.println(Ninja.getLevel());
			Ninja.incLevel();
			//System.out.println(Ninja.getLevel());
			Ninja.save();
			Scanner s2 = new Scanner(System.in);
			if(Ninja.load("ninja") == true){
				System.out.println("sucess");
			}else{
				System.out.println("failure");
			}	
		}else if(testNum.compareTo("1")==0){
			Scanner s3 = new Scanner(System.in);
			System.out.print("file name?: ");
			loadName = s3.next();
			if(Ninja.load(loadName) == true){
				System.out.println("sucess");
			}else{
				System.out.println("failure");
			}
		}else{
			System.out.println("error1");
		}
		

	}

}
