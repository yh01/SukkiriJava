package method;

public class Main{
	/*
	public static void methoda() {
		System.out.println("methoda");
		methodb();
	}
	public static void methodb() {
		System.out.println("methodb");
	}
	public static void main(String[] args){
		methoda();
	}
	*/

	/*
	public static void main(String[] args){
		System.out.println("メソッドを呼び出します");
		hello("湊");
		hello("朝香");
		hello("菅原");
		System.out.println("メソッドの呼び出しが終わりました");
	}
	public static void hello(String name){
		System.out.println(name + "さん、こんにちは");
	}
	*/

	/*
	public static void main(String[] args){
		System.out.println("メソッドを呼び出します");
		hello(1,"湊");
		hello(2,"朝香");
		hello(3,"菅原");
		System.out.println("メソッドの呼び出しが終わりました");
	}
	public static void hello(int number, String name){
		System.out.println(number + "は" + name + "です");
	}
	*/

	/*
	public static int add(int x, int y){
		int ans = x + y;
		return ans;
	}
	public static void main(String[] args){
		int ans = add(100,10);
		System.out.println("100 + 10 = " + ans);
	}
	*/

	/*

	public static int add(int x, int y){
		int ans = x + y;
		return ans;
	}
	public static void main(String[] args){
		System.out.println(add(add(10,10),add(10,20)));
	}
	*/

	/*
	public static int add(int x, int y){
		return x + y;
	}
	public static double add(double x, double y){
		return x + y;
	}
	public static String add(String x, String y){
		return x + y;
	}
	public static void main(String[] args){
		System.out.println(add(10,10));
		System.out.println(add(1.0,1.0));
		System.out.println(add("aa","bb"));
	}
	*/

	/*
	public static int add(int x, int y){
		return x + y;
	}
	public static int add(int x, int y, int z){
		return x + y + z;
	}
	public static void main(String[] args){
		System.out.println(add(10,10));
		System.out.println(add(10,10,10));
	}
	*/
	/*
	public static void main(String[] args){
		int j = 3;
		for(int a = 1; a<=30; a++){
			int s = a * j;
			if(s <= 30){
				System.out.println(s);
			}else if(s <= 60){
				System.out.println(s);
			}else if(s <= 90){
				System.out.println(s);
			}
		}
	}
	*/
	/*
	public static void printArray(int[] array){
		for(int element : array){
			System.out.println(element);
		}
	}
	public static void main(String[] args){
		int[] array = {1,2,3};
		printArray(array);
	}
	*/

/*
	public static void incArray(int[] array){
		for(int i = 0; i < array.length; i++){
			array[i]++;
		}
	}
	public static void main(String[] args){
		int[] array = {1,2,3};
		incArray(array);
		for(int i : array){
			System.out.println(i);
		}
	}
*/


	/*
	public static int[] makeArray(int size){
		int[] newArray = new int[size];
		for(int i = 0; i < newArray.length; i++){
			newArray[i] = i;
		}
		return newArray;
	}
	public static void main(String[] args){
		int[] array = makeArray(3);
		for(int i : array){
			System.out.println(i);
		}
	}
	*/
	/*
	public static void main(String args[]) throws IOException{
		System.out.println("--処理開始--");
		//コマンドライン引数が入力されているかチェックを行う
		if(args.length==0){
			System.out.println("コマンドライン引数を指定して入力しなおしてください。");
			System.out.println("[例] > java TextStream C:\test\test.txt");
			System.out.println("\n処理を終了します");
			return;
		}
		// ファイルパスを指定する
		File file = new File(args[0]);
		// ディレクトリパスを取得する
		File dir=new File(file.getParent());

		if(!dir.exists()){
			System.out.println("フォルダがありません。:"+file.getAbsolutePath());
			dir.mkdirs();
			System.out.println("作成成功");
		} else {
			System.out.println("フォルダは既に存在します。");
		}

		if(file.exists()){
			System.out.println("ファイルは既に存在します。\n" + file.getAbsolutePath());
		}else{
			System.out.println("ファイルは存在しません。\n"+file.getAbsolutePath());
			try{
				if (file.createNewFile()){
					System.out.println("作成成功");
				}else{
					System.out.println("作成失敗");
				}
			}catch(IOException e){
				System.out.println(e);
			}
		}



		int end = 0;
		while(end==0){

			System.out.println("\n\n--メニュー--\n\n 1:読み込み\n 2:書き込み\n99:終了\nを入力してください");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();
			int nu = 0;

			if(str.matches("^[0-9]+$")){
				nu=Integer.parseInt(str);
			}else{
				System.out.println("\n----------\n半角数値でメニューを選択してください。\n----------\n");
			}

			if(nu==99){
				System.out.println("終了");
				break;
			}
			if(nu==1){
				System.out.println("ファイルを読む");
				try{
					FileReader filereader = new FileReader(file.getAbsolutePath());

					int ch;
					while((ch = filereader.read()) != -1){
						System.out.print((char)ch);
					}

					filereader.close();
				}catch(FileNotFoundException e){
					System.out.println(e);
				}catch(IOException e){
					System.out.println(e);
				}
			}
			if(nu==2){
				System.out.println("ファイルを書く");
				try {
					boolean mode = false;
					System.out.println("モードの設定。1:追記、2:上書き");
					BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
					String str2 = br2.readLine();
					// モードを決める
					switch (str2) {
					case "1":
						mode = true;
						break;
					case "2":
						mode = false;
					default:
						break;
					}
					//出力先を作成する
					FileWriter fw = new FileWriter(file.getAbsolutePath(), mode);
					PrintWriter pw = new PrintWriter(new BufferedWriter(fw));

					//内容を指定する
					BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
					String str3 = br3.readLine();
					pw.println(str3);

					//ファイルに書き出す
					pw.close();

					//終了メッセージを画面に出力する
					System.out.println("出力が完了しました。");

				} catch (IOException ex) {
					//例外時処理
					ex.printStackTrace();
				}

			}
		}
		System.out.println("--処理終了--");
	}
	*/
	/*
	public static void pr(int[] array){
		for(int element : array){
			System.out.println(element);
		}
	}
	public static void main(String[] args){
		int[] array = {1,2,3};
		pr(array);
	}
	*/

	/*
	public static int[] mkA(int size){
		int[]newA = new int[size];
		for(int i = 0; i < newA.length; i++){
			newA[i] = i;
		}
		return newA;
	}
	public static void main(String[]args){
		int[] array = mkA(3);
		for(int i : array){
			System.out.println(i);
		}
	}
	*/

	/*
	public static void introduceOneself(){
		String name;
		int age;
		float t;
		char s;
		name = "AB";
		age = 20;
		t = 170.0F;
		s = '男';
		System.out.println(name + "\n" + age + "\n" + t + "\n" + s + "\n");
	}
	public static void email(String title,String address,String text){
		System.out.println("件名：" + title);
		System.out.println("宛先アドレス：" + address);
		System.out.println("本文：" + text);
	}
	public static void main(String[]args){
		introduceOneself();
		email("あああ","いいい","ううう");
	}
	*/
	// キーボードから文字列を読み込む
	public static void main(String[] args){
		System.out.println("スタート");
		System.out.println("数字を入力してください \n ターン数が100になるまでに当ててください");

		try {
		    // ここで NumberFormatExceptionが投げられる可能性がある


			int a = 0;
			int ans = new java.util.Random() .nextInt(100);
				for(int i = 1; i <= 100; i++){
					@SuppressWarnings("resource")
					String x = new java.util.Scanner(System.in) .nextLine();
					long input;
				    input = Integer.parseInt(x);
					if(ans == input){
						System.out.println("True!");
						break;
					}else if(ans != input){
						System.out.println("False...");
					}

					if(input > ans){
						System.out.println("ヒント：答えは入力した数より小さいです");
					}else if(input < ans){
						System.out.println("ヒント：答えは入力した数より大きいです");
					}
					a++;
					System.out.println("現在のターン数 : " + a);
				}
		} catch (NumberFormatException e) {
		    // NumberFormatExceptionが投げられたらここで捕まえる．
		    // e には例外の情報が入っている．(eは変数なのでeという名前である必要はない)
		    System.out.println("ちゃんと数字を入れてください!");
		}


	}
}

