package calcapp.main_java6_5;
import calcapp.logic_java_6_6.CalcLogic;;

public class Calc {
	public static void main(String[] args){
		int a = 10; int b = 2;
		int total = CalcLogic.tasu(a,b);
		int delta = calcapp.logic_java_6_6.CalcLogic.hiku(a,b);
		System.out.println("足すと" + total + "、引くと" + delta);
	}
}
