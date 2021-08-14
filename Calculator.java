package week1.day2;
public class Calculator {
	//	int num1=75;
	//	int num2=36;
	//	int num3=12;
	
	public int add(int num1, int num2, int num3) {
		int num4 = num1 + num2 + num3;
		System.out.println("Addition output is = " + num4);
		return num4;
		}
	public int sub(int num1, int num2) {
		int num5 = num1 - num2;
		System.out.println("Substraction output is = " + num5);
		return num5;
		}
	public double mul(double num1, double num2) {
		double num6 = num1 * num2;
		System.out.println("Product output is " + num6);
		return num6;
		}
	public float divide(float num1, float num2) {
		float num7 = num1 / num2;
		System.out.println("Division output is " + num7);
		return num7;
		}
	public static void main(String[] args) {
		Calculator calobj = new Calculator();
		calobj.add(28,16,5);
		calobj.sub(20,16);
		calobj.mul(28.452,16.568);
		calobj.divide(16,22);
		// calobj.add();
		// calobj.sub();
		// calobj.mul();
		// calobj.divide();
		}
	}