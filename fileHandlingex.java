import java.io.*;
import java.util.Scanner;

class read{
	void funcread(){
	try {
        File Obj = new File("myfile1.txt");
        Scanner Reader = new Scanner(Obj);
        while (Reader.hasNextLine()) {
            String data = Reader.nextLine();
            System.out.println(data);
        }
        Reader.close();
    }
    catch (FileNotFoundException e) {
        System.out.println("An error has occurred.");
        e.printStackTrace();
    }
}
}
class write{
	void funcwrite() {
	try {
        FileWriter Writer = new FileWriter("myfile1.txt");
        Writer.write("Hello World!");
        Writer.close();
        System.out.println("Successfully written.");
    }
    catch (IOException e) {
        System.out.println("An error has occurred.");
        e.printStackTrace();
    }
}
}
class append{
	void funcappend() throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("myfile1.txt", true));
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter text to append!");
		String str = sc.nextLine();
        bw.write(str);
        bw.close();
	}
}
public class fileHandlingex {
	public static void main(String[] args) throws IOException {
		File Obj = new File("myfile1.txt");
        if (Obj.createNewFile()) {
            System.out.println("File created: "+ Obj.getName());
        }
        else {
            System.out.println("File already exists.");
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to read or 2 to add text!");
        System.out.println("Enter 3 to append and 4 to exit");
        
        while(true) {
        	int a = sc.nextInt();
        	if(a==1) {
        		read r = new read();
            	r.funcread();
            	
        	}
        	else if(a==2) {
        		write w = new write();
        		w.funcwrite();
        		
        	}
        	else if(a==3) {
        		append ap = new append();
        		ap.funcappend();
        	}
        	else if(a==4) {
        		break;
        	}
        	
        }
        
	}
}
