import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class CountNumberOfFile {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input your file name");
        String fileName=scanner.nextLine();
        count(fileName);
    }
    public static void count(String fileName){
        try {
            BufferedReader reader=new BufferedReader(new FileReader(fileName));
            String line;
            double sum=0;
            while ((line=reader.readLine())!=null){
                double value=Double.parseDouble(line);
                sum+=value;
            }
            System.out.println(sum);
            reader.close();

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
