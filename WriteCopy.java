
import java.io.*;;
public class WriteCopy {
    public static void copyfile(File source , File destination)throws Exception{
        FileInputStream in = new FileInputStream(source);
        FileOutputStream out = new FileOutputStream(destination);
        int n;
        while((n=in.read())!=-1){
            out.write(n);
        }
        in.close();
        out.close();
    }
    public static void main(String[] args) throws IOException {
        FileWriter f = new FileWriter("Student_Info.txt");
        f.write("I am Aswin Pratapsingh from OPJU currently in 3rd Semester\n Hope you have a great day");
        f.close();
        File source = new File("Student_Info.txt");
        File dest = new File("Copy_Student_Info.txt");
        try {
            copyfile(source,dest);
            
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        

    
    }
}
