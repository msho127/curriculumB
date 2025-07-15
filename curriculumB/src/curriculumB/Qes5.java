package curriculumB;

public class Qes5{
	// 2
	// メソッド定義する  戻り値の型int メソッド名doubleValue(引数)
	public static int doubleValue(int num) {
		// 引数の値を二倍になるように戻り値を設定
		return num * 2;
	}
	
	// 3
	// メソッド定義する  戻り値の型boolean メソッド名isEven(引数)
	public static boolean isEven(int num) {
		// 引数の値を2で割り切れるのであればtrue、割り切れないのであればfalse
		return num % 2 == 0;
	}

	public static void main(String[] args) {
		/*----------------------------------
		[概要] "Hello,world！" の出力
		[詳細] コンソール画面に"Hello,world！"と出力する。
		----------------------------------*/
		// コンソール画面に"Hello,world！"と表示する。
		System.out.println("Hello,world！");	
		System.out.println();	
		
		/*----------------------------------
		[概要] doubleValueメソッドの使用
		[詳細] メソッドdoubleValueを使って数値10を2倍にし、その結果を出力する。
		----------------------------------*/
		// メソッド、doubleValueを呼び出す。
		// int result1 = doubleValue(10);
		// コンソール画面に変数result1を表示する。
		// System.out.println(result1);
		
		// コンソール画面にメソッド名doubleValue(10)の結果を表示する。
		System.out.println(doubleValue(10));
		System.out.println();
	
		/*----------------------------------
		[概要] isEvenメソッドによる偶奇判定
		[詳細] 変数num1とnum2に格納された整数が偶数か奇数かを判定して結果を出力する。
		----------------------------------*/
		// 型に変数を設定し、値を代入する。
		int num1 = 7;
		int num2 = 10;
		
		// コンソール画面に変数num1が偶数か奇数かの結果を表示する。
		System.out.println(num1 + "は" + (isEven(num1) ? "偶数" : "奇数") + "です。" );
		// コンソール画面に変数num2が偶数か奇数かの結果を表示する。
		System.out.println(num2 + "は" + (isEven(num2) ? "偶数" : "奇数") + "です。" );
		System.out.println();
		
		/*----------------------------------
		[概要] Greetingクラスのメソッド呼び出し
		[詳細] GreetingクラスのsayHelloメソッドを実行して挨拶を表示する。
		----------------------------------*/
		// Greeting greeting = new Greeting();
		// Greetingをインポートし、sayHello()を実行する。
		Greeting.sayHello();
		System.out.println();
	
		/*----------------------------------
		[概要] Animalクラスの使用と出力
		[詳細] Animalクラスのインスタンスを生成し、動物の名前・体長・速度を設定して出力する。
		----------------------------------*/
		// Animalをインポートし、変数animalにAnimal()を代入する。
		Animal animal = new Animal();
		
		// setNameメソッドを使用し、名前を"ライオン"に設定する。
		animal.setName("ライオン");
		// setLengthメソッドを使用し、体長を"2.1"に設定する。
		animal.setLength(2.1);
		// setSpeedメソッドを使用し、速度を"80"に設定する。
		animal.setSpeed(80);
		
		// コンソール画面に"動物名：(名前)"を表示する。
		System.out.println( "動物名：" + animal.getName());
		// コンソール画面に"体長：(体長)m"を表示する。
		System.out.println( "体長：" + animal.getLength() + "m" );
		// コンソール画面に"速度：(速度)km/h"を表示する。
		System.out.println( "速度：" + (int)animal.getSpeed() + "km/h" );
		

	}	
}
