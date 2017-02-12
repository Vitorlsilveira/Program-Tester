/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testRunDetails;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.*;
import java.util.List;
import java.util.Scanner;
import lib.runDetails.*;

/**
 *
 * @author Rushabh Modi
 */
public class IOManagerTest {
    public static void main(String... args) throws IOException{
        IntIODetail io;
        Path pi;
        Scanner sc=new Scanner(System.in);
        long programID=sc.nextLong();
        int index=sc.nextInt();
        if(args.length>0)
               pi=Paths.get(args[0]);
          else
               pi=Paths.get("input.txt");
          System.out.println("pi :- "+pi);
          List<String> input=Files.readAllLines(pi);
        if(args.length>1)
               pi=Paths.get(args[1]);
          else
               pi=Paths.get("output.txt");
          System.out.println("pi :- "+pi);
          List<String> output=Files.readAllLines(pi);
        io=IOManager.getIODetail(input, output,-1,programID,index);
        pi=Paths.get("temp").toAbsolutePath();
        System.out.println(IOManager.writeIntIODetail(io, pi,true));
        System.out.println(IOManager.writeIntIODetail(io, pi));
    }
}
