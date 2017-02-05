package lib.runTestTemp;
import java.io.IOException;
import lib.runDetails.*;
import lib.runTest.*;
import java.util.*;
import java.nio.file.StandardOpenOption;
import java.nio.file.*;
/**
 *
 * @author Neel Patel
 */
public class TestRunTest {
     static Scanner sc=new Scanner(System.in);
     public static void main(String... arg) throws IOException{
          System.out.println("Working Directory = " +System.getProperty("user.dir"));
          String com=sc.nextLine();
          //Path c=Paths.get(com).toAbsolutePath();
          System.out.println("com :- "+com);
          Path pi;
          if(arg.length>0)
               pi=Paths.get(arg[0]);
          else
               pi=Paths.get("input.txt");
          System.out.println("pi :- "+pi);
          List<String> input=Files.readAllLines(pi);
          System.out.println("input read completed.");
          RunTest rt=new RunTest(IOManager.getIODetail(input,null, 0),com);
          System.out.println("process start.");
          //rt.run();
          IntIODetail obj=rt.getIODetail();
          System.out.println("process completed. obj :- ");
          if(arg.length>1)
               pi=Paths.get(arg[1]);
          else
               pi=Paths.get("output.txt");
          System.out.println("pi :- "+pi);
          Files.write(pi,obj.getAllOutput(),StandardOpenOption.CREATE_NEW);
          System.out.println("Time :- "+obj.getTime());
     }
}
