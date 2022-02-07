/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cardgame;
import java.util.Scanner;
/**
 *
 * @author janpa
 */
public class CardGame {
private double mem;
	
	/**
	 * constructor Calculator initializes mem to zero
	 */
public void printInfo(){
System.out.println(name-harmandeep ,course-computer programming);
}
/**
 *this method  stores sum of two arguments in mem
 * @param x
 * @param y
 * @return x+y
 */
public double add(double x, double y) {
	mem =x+y;
	return mem;
}

/**
 * this method stores difference of two numbers in mem
 * @param x
 * @param y
 * @return y-x
 */
public double subtract(double x,double y) {
	mem=y-x;
	return mem;
}

/**
 * it stores product of numbers in mem
 * @param x
 * @param y
 * @return x*y
 */
public double multiply(double x,double y) {
	mem=x*y;
return mem;}

/**
 * this method divides two numbers and store the answer in mem
 * @param x
 * @param y
 * @return x/y
 */
public double divide(double x,double y) {
	mem=x/y;
	return mem;
	
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("enter two number to add");
        double a= sc.nextDouble();
        double b=sc.nextDouble();
        CardGame cal= new CardGame();
        
     double c =   cal.add(a, b);
        System.out.print(c);
                  
	cal.printInfo();
    }
    
}
