import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
import javax.swing.*;

public class Calculator
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char c = sc.next().charAt(0);
        if(c=='*'){System.out.println(a*c);}
        else if(c=='/'||c==':'){System.out.println(a/b);}
        else if(c=='+'){System.out.println(a+b);}
        else if(c=='-'){System.out.println(a-b);}
    }
}
