package method;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 */

/**
 * @author internous
 *
 */

public class HelloWorld {

	/**
	 * @param args
	 */
	/*
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for(int i = 5; i >= 0; i--){
			for(int j = 0; j <= i + 1; j++){
				System.out.print("★");
			}
			System.out.println(" ");
		}
	}
	*/

	/*
	//数当てゲーム
	public static void main(String[] args){
		System.out.println("数字を入力してください");
		int input = new java.util.Scanner(System.in). nextInt();
		int ans = 50;
		for(int i = 0; i <= 100; i++){
			if(i == ans && i == input){
				System.out.println("True!");
			}else if(i == ans && i != input){
				System.out.println("False...");
			}
		}
	}
	*/

	/*
	//九九表
	public static void main(String[] args){
		for(int i = 0; i <= 9; i++){
			for(int j = 0; j <= 9; j++){
				System.out.print(i * j);
				System.out.print(" ");
			}
			System.out.println("");
		}
	}
	*/

	/*
	public static void main(String[] args){
		final int a = 10;
		int b = 10;
		System.out.println(Math.min(a - b,10));
	}
	*/


	//テキストファイル読み書きプログラム
/*
	public static void main(String[] args)
			throws IOException{
			FileWriter fw =
					new FileWriter("C:\\Users\\internous\\Documents\\testjava.txt",true); //step1
			fw.write("test");
			fw.flush();
			fw.close();
	}
*/
	public static void Mkdir(){
		@SuppressWarnings("resource")
		String fileN = new java.util.Scanner(System.in) .nextLine();
		File newfile = new File(fileN);
		try {
			newfile.createNewFile();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}

	public static void Out(){
		@SuppressWarnings("resource")
		String fileN = new java.util.Scanner(System.in) .nextLine();
		FileReader fileR = null;
		try{
			  fileR = new FileReader(fileN);

			int ch;
			while((ch = fileR.read()) != -1){
			  System.out.print((char)ch);
			}


			}catch(FileNotFoundException e){
			  System.out.println(e);
			}catch(IOException e){
			  System.out.println(e);
			}finally{
				if(fileR != null){
					try{
						if(fileR != null){
							fileR.close();
						}
					}catch(IOException e2){}
				}
			}
	}

	public static void Inp(){
			FileWriter fw = null;
			@SuppressWarnings("resource")
			String fileN = new java.util.Scanner(System.in) .nextLine();
			@SuppressWarnings("resource")
			String input1 = new java.util.Scanner(System.in) .nextLine();
			try{
				fw = new FileWriter(fileN,true);
				fw.write(input1 + "\r\n");
				fw.flush();
			}catch(IOException e){
				System.out.println("ファイル書き込みエラーです");
			}finally{
				if(fw != null){
					try{
						if(fw != null){
							fw.close();
						}
					}catch(IOException e2){}
				}
			}
	}

	/*
	public static void main(String[] args){
		int input = new java.util.Scanner(System.in) .nextInt();
		for(;;){


					Mkdir();
					return;
					continue;

					Inp();

					Out();

			if(input == 5){
				System.out.println("終了");
				break;
			}
		}
	}
	*/
	/*
	public static void add(int x,int y){
		System.out.println("数字を入力してください");
		x = new java.util.Scanner(System.in). nextInt();
		System.out.println("もう一度数字を入力してください");
		y = new java.util.Scanner(System.in). nextInt();
		for(int i = 1; i <= x; i++){
			for(int j = 1; j <= y; j++){
				System.out.print(i * j);
				System.out.print(" ");
			}
			System.out.println("");
		}	}
	public static void main(String[] args){
		add(0, 0);
	}
	*/

}
