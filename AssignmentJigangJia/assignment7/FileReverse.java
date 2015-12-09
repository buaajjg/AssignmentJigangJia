package assignment7;

import java.io.*;
import java.util.ArrayList;

public class FileReverse {
	public ArrayList<String> list= new ArrayList<>();
	public static void main(String[] args) throws Exception {
		FileReverse fr= new FileReverse();
		fr.storeInList();
		fr.outputToConsole();
	}
	public void storeInList() throws FileNotFoundException, IOException{
		File file= new File("test.txt");
		FileReader fr= new FileReader(file);
		BufferedReader br= new BufferedReader(fr);
		String line=null;
		
		while((line=br.readLine())!=null){
			list.add(line);
		}
		br.close();
		
	}
	public void outputToConsole(){
		while(list.size()!=0){
			System.out.println(list.remove(list.size()-1));
		}
	}
	public ArrayList<String> getList(){
		return list;
	}
	
}
