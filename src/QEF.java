import java.util.Scanner;

public class QEF {

	//  Quadratic Equations and Functions
	public static void main(String[] args) {
		
		int a, b, c;
		double x1, x2;
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("A = ");
        a = scanner.nextInt();
        System.out.print("B = ");
        b = scanner.nextInt();
        System.out.print("C = ");
        c = scanner.nextInt();
        
        System.out.print(a + "X^2+" + b+ "X+" + c +"= 0");

        if(b*b > 4*a*c){
            x1 = (- b + Math.sqrt(b*b - (4*a*c)))/2*a;
            x2 = ( -b - Math.sqrt(b*b - (4*a*c)))/2*a;
            System.out.println("方程式解為 x1= " + x1 + ", x2=" + x2); //求解方程根
        }else if(b*b == 4*a*c){
            x1 = (- b + Math.sqrt(b*b - (4*a*c)))/2*a;
            System.out.println("方程式有一個解 x1=x2=" + x1);
        }else{
            System.out.println("方程式無解");
        }
        
	}

}
