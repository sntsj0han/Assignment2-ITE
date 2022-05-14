
import java.util.Scanner;
import javax.swing.JOptionPane;

public class PerfectOrFactors
{
public static void main (String[]args){
int n;
do{
Scanner sc = new Scanner(System.in);
System.out.print("Enter Your Number: ");
n = sc.nextInt();
}while(n<=0);
for (int i = 1; i < n/2; i++){
    if (i * i == n)
    {
        JOptionPane.showMessageDialog(null, "PERFECT!");
        System.exit(0);
    }
}
for (int i = 1; i <= Math.sqrt(n); i++){
     if (n % i == 0 && i * i != n) 
     {
        if(n / i == i){
        JOptionPane.showMessageDialog(null, i);}
        else{
        JOptionPane.showMessageDialog(null,   i+ " , " + n/i);
    }
}
}
}
}