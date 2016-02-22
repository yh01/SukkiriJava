package java6_10;

public class Main {
	public static void main(String[] args){
		int[] height = {172,149,152,191,155};
		java.util.Arrays.sort(height);
		for(int h : height){
			System.out.println(h);
		}
	}
}
