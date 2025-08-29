import java.io.DataInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class MyException {
    public static void main(String[] args)throws SQLException,IOException {
        int x,y,z=0;
        DataInputStream dis=new DataInputStream(System.in);
//        Scanner sc=new Scanner(System.in);

            try{
                x=dis.readInt();
                y=dis.readInt();
                z=x/y; //Exception occurs
                System.out.println("Exception Not Occur");
            }
            catch (IOException e)
            {

            }




    }
}
