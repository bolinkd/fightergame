import java.io.*;
public class Character {
	int level;
	String name;
	public void setLevel(int a){
		level = a;
	}
	public void incLevel(){
		level++;
	}
	public void setName(String a){
		name = a;
	}
	public String getName(){
		return name;
	}
	public int getLevel(){
		return level;
	}
	public void save(){
		PrintWriter writer = null;
		try{
			writer = new PrintWriter(name+".txt");
		} catch(FileNotFoundException e) {
			System.err.println("ERROR 13"); 
		}
		writer.println(name);
		writer.println(level);
		writer.close();
	}
	public boolean load(String filename){
		BufferedReader br = null;
	    try {
	    	br = new BufferedReader(new FileReader(filename+".txt"));
	        name = br.readLine();
	        System.out.println(name);
	        level = Integer.parseInt(br.readLine());
	        System.out.println(Integer.toString(level));
	    } catch(FileNotFoundException e) {
	    	return false;
	    } catch(IOException e) {
	    	return false;  
	    }
	    return true;
	}
}
