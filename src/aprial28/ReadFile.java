package aprial28;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class ReadFile {

	public static void main(String[] args)throws Throwable {
File f=new File("d://prasad.txt");
FileWriter fw=new FileWriter(f);
BufferedWriter bw=new BufferedWriter(fw);
bw.write("im lazy to write english");
bw.newLine();
bw.newLine();
bw.write("im sleeping");
bw.newLine();
bw.write("im practice");
bw.flush();
bw.close();
	}

}
