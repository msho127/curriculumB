package curriculumB;

public class Qes1 {

	public static void main(String[] args) {

		/*----------------------------------
		 [概要] 各データ型の変数を宣言する処理
		 [詳細] byte, short, int, long, float, double, char, String, booleanの変数を宣言する。
		----------------------------------*/
		// 型に変数を設定
		byte byteNum;
		short shortNum;
		int intNum;
		long longNum;
		float floatNum;
		double doubleNum;
		char letter;
		String letters;
		boolean isBoolean;

		/*----------------------------------
		 [概要] 各変数に初期値を代入する処理
		 [詳細] 変数に指定された値を代入する。
		----------------------------------*/
		// 変数に値を代入
		byteNum = 10;
		shortNum = 100;
		intNum = 1000;
		longNum = 10000;
		floatNum = 9.5f;
		doubleNum = 10.5;
		letter = 'a';
		letters = "ハロー";
		isBoolean = true;

		/*----------------------------------
		 [概要] 変数を用いた演算および出力処理
		 [詳細] 計算結果や文字列結合をコンソールに出力する。
		----------------------------------*/
		// 四則演算と出力
		System.out.println(byteNum + shortNum + intNum + longNum);
		System.out.println(byteNum + byteNum);
		System.out.println(letter + letters + isBoolean);
		System.out.println(byteNum + byteNum + byteNum + shortNum + intNum + longNum);
		System.out.println(byteNum * shortNum * intNum * longNum);
		System.out.println(doubleNum / shortNum);
		System.out.println(byteNum - shortNum);
		System.out.println();
		
		/*----------------------------------
		 [概要] ユーザー名を出力する処理
		 [詳細] 変数nameに文字列を代入し、挨拶文を出力する。
		----------------------------------*/
		//型に変数を設定
		String name;
		//変数に"山田太郎"を代入
		name = "山田太郎";
		//コンソール画面に"こんにちは山田太郎さん！"と表示する。
		System.out.println("こんにちは、" + name + "さん！");
		System.out.println();
		
		/*----------------------------------
		 [概要] 年齢を出力する処理
		 [詳細] 変数ageに年齢を代入し、文字列と結合して出力する。
		----------------------------------*/
		//型に変数を設定
		int age;
		//変数に"25"を代入
		age = 25;
		//コンソール画面に"年齢:25歳"と表示する。
		System.out.println("年齢:" + age + "歳");
		System.out.println();
		
		/*----------------------------------
		 [概要] 数値の合計を計算する処理
		 [詳細] num1とnum2を足し、sumに代入して出力する。
		----------------------------------*/
		//型に変数を設定
		int num1;
		int num2;
		int sum;
		//変数に値を代入
		num1 = 10;
		num2 = 5;
		//変数sumに変数num1と変数num2を足した値を代入
		sum = num1 + num2;
		//コンソール画面に変数sumを表示する。
		System.out.println(sum);
		System.out.println();
		
		/*----------------------------------
		 [概要] 変数の更新処理
		 [詳細] 変数scoreに20を加算して出力する。
		----------------------------------*/
		//型に変数を設定
		int score;
		//変数に値を代入
		score = 80;
		//変数scoreを20足した値に更新
		score = score + 20;
		//コンソール画面に変数scoreを表示する。
		System.out.println(score);
		System.out.println();
		
		/*----------------------------------
		 [概要] 実数から整数への型変換処理
		 [詳細] double型をint型にキャストし、出力する。
		----------------------------------*/
		//型に変数を設定
		double price;
		//変数に値を代入
		price = 99.99;
		//変数priceの値を変数intPriceに代入し、強制型変換する。
		int intPrice = (int) price;
		//コンソール画面に"整数価格:99"と表示する。
		System.out.println("整数価格:" + intPrice);
		System.out.println();
		
		/*----------------------------------
		 [概要] 文字列から整数への変換処理
		 [詳細] 文字列をint型に変換し、加算して出力する。
		----------------------------------*/
		//型に変数を設定し、値を代入する。
		String numStr = "123";
		//
		int intNumStr = Integer.parseInt(numStr);
		System.out.println(intNumStr + 10);
		System.out.println();
		
		/*----------------------------------
		 [概要] 整数から文字列への変換処理
		 [詳細] int型をString型に変換して、文字列と結合して出力する。
		----------------------------------*/
		int num = 50;
		String strNum = String.valueOf(num);
		System.out.println("得点:" + strNum + "点");
		System.out.println();
		
		/*----------------------------------
		 [概要] 比較演算結果の出力処理
		 [詳細] aとbを比較し、結果をboolean型で出力する。
		----------------------------------*/
		int a = 10;
		int b = 20;
		boolean result = a < b;
		System.out.println(result);
		System.out.println();
		
		/*----------------------------------
		 [概要] 条件演算子による文字列選択処理
		 [詳細] xの値が10以上かどうかで"ok"か"ng"を選び出力する。
		----------------------------------*/
		int x = 15;
		String result1 = (x >= 10) ? "ok" : "ng";
		System.out.println(result1);
		System.out.println();
		
		/*----------------------------------
		 [概要] 文字列置換処理
		 [詳細] "java"という文字列を"python"に置き換えて出力する。
		----------------------------------*/
		String text = "私はjavaが好きです。java楽しい!";
		String replacedText = text.replace("java", "python");
		System.out.println(replacedText);
		System.out.println();
	}
}
