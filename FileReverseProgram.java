import java.util.*;
import java.io.*;

public class FileReverseProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> lines=new HashMap<String,String>();

	    try{
	        FileInputStream fstream=new FileInputStream("//Users//Desktop//text.txt");
	        DataInputStream in=new DataInputStream(fstream);
	        BufferedReader br=new BufferedReader(new InputStreamReader(in));
	        ArrayList arr=new ArrayList();
	        String str,str1;
	        int i=0;
	        while((str=br.readLine())!=null){
	            i++;
	            str1=Integer.toString(i);
	            if(lines.containsValue(str)){
	                System.out.println(str);
	            }else{
	                lines.put(str1, str);
	            }
	        }
	        in.close();
	    }catch(Exception e){
	        System.out.println(e);
	    }


	}

}
