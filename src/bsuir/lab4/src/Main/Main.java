package Main;

import Classes.MyThread;

import java.util.Scanner;


public class Main {

    public static void main (String args[]) throws Exception{
        String buffer;
        int n;
        System.out.println("Input count");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();in.nextLine();
        String arr[]=new String[n];
        for(int i=0;i<n;++i)
        {
            buffer=in.nextLine();
            arr[i] = buffer;
        }

        for(int i=0; i<n;++i)
        {
            MyThread thr = new MyThread(arr[i]);
            thr.start();
            thr.join();
        }
        System.out.println("Hello Java!");
    }
}

