package curriculumB;

import java.util.Scanner;

public class Qes4 {

	public static void main(String[] args) {
		
		/*----------------------------------
	    [概要] 配列の要素を順に表示する
	    [詳細] int型の配列に 1～5 を格納し、for文で順番に出力する
	   ----------------------------------*/
		// 型に変数を設定し、配列に代入する。
		int[] numbers = { 1,2,3,4,5 };
		// 初期値0を1ずつ増やし配列の個数の方が多くなった時、動作を終了する。
		for( int i = 0; i < numbers.length; i++ ) {
			// コンソール画面にnumbers[i]を表示する。
			System.out.println( numbers[i] );
		}
		System.out.println();

		/*----------------------------------
		[概要] 配列の要素を逆順で表示する
		[詳細] int型の配列に 10～50 を格納し、for文で逆順に出力する
		----------------------------------*/
		// 変数に配列を代入する。
		numbers = new int[] {10, 20, 30, 40, 50};
		// 初期値4を1ずつ減らし0以下になった時、動作を終了する。
		for( int i = numbers.length -1; i >= 0; i-- ) {
			// コンソール画面にnumbers[i]を表示する。
			System.out.println( numbers[i] );
		}
		System.out.println();
		
		/*----------------------------------
		[概要] 配列の要素の合計を表示する
		[詳細] int型の配列に奇数を格納し、for文で全要素の合計を求めて出力する
		----------------------------------*/
		// 変数に配列を代入する。
		numbers = new int[] {3, 5, 7, 9, 11};
		// 型を設定し、変数を代入する
		int sum = 0;
		// 初期値0を1ずつ増やし配列の個数の方が多くなった時、動作を終了する。
		for( int i = 0; i < numbers.length; i++ ) {
			// 変数sumに配列number[i]を足す
			sum += numbers[i];
		}
		// コンソール画面にsumを表示する。
		System.out.println( sum );
		System.out.println();

		/*----------------------------------
	    [概要] 配列内の最大値と最小値を求める
	    [詳細] 配列の全要素を調べ、最大値と最小値を表示する
	   ----------------------------------*/
		// 変数に配列を代入する。
		numbers = new int[] {12, 7, 9, 21, 5 , 18};
		// 型を設定し、配列を代入する。
	    int max = numbers[0];
	    int min = numbers[0];
	    // 配列numbersを順番に変数numに代入し動作する。
	    for (int num : numbers) {
	    	// もし変数numが変数maxより大きかった場合、以下を適用する。
	        if (num > max) {
	        	// 変数maxの中に変数numの数値を代入する。
	            max = num;
	        }
	        // もし変数numが変数minより小さかった場合、以下を適用する。
	        if (num < min) {
	        	// 変数numの中に変数numの数値を代入する。
	            min = num;
	        }
	    }
	    // コンソール画面に"最大値：" 変数max を表示する。
	    System.out.println("最大値: " + max);
	    // コンソール画面に"最小値：" 変数min を表示する。
	    System.out.println("最小値: " + min);
	    System.out.println();
		
		/*----------------------------------
	    [概要] 配列内のすべての要素を2倍にして表示
	    [詳細] 通常のfor文で各要素を2倍にして、拡張for文で表示
	   ----------------------------------*/
	    // 変数に配列を代入する。
	    numbers = new int[] {1, 2, 3, 4, 5};
	    // 初期値0を1ずつ増やし配列の個数の方が多くなった時、動作を終了する。
	    for (int i = 0; i < numbers.length; i++) {
	    	// 配列numbers[i]を二倍にし、配列numbers[i]に代入する。
	        numbers[i] = numbers[i] * 2;
	    }
	    // 配列numbersを順番に変数numに代入し動作する。
	    for (int num : numbers) {
	    	// コンソール画面に変数numを表示する。
	        System.out.println(num);
	    }
	    System.out.println();
	    
		/*----------------------------------
	    [概要] ユーザーが入力した値が配列に含まれるかを判定する
	    [詳細] 配列を走査して、入力された値が含まれていればメッセージを表示
	   ----------------------------------*/
	    // 変数に配列を代入する。
	    numbers = new int[] {4, 7, 10, 15, 20};
	    // スキャナーを作成
	    Scanner scanner = new Scanner(System.in);
	    // コンソール画面に"数値を入力してください："を表示する。
	    System.out.print("数値を入力してください：");
	    // 変数inputにスキャナーで取得した数値を代入する。
	    int input = scanner.nextInt();
	    
	    // 変数foundの初期値をfalseに設定する。
	    boolean found = false;
	    
	    // 配列numbersを順番に変数numberに代入し動作する。
	    for (int number : numbers) {
	    	// もし変数numberと変数inputが同数になった場合、以下を適用する。
	        if (number == input) {
	        	// 変数foundの値をtrueにする。
	            found = true;
	            // if文を終了する。
	            break;
	        }
	    }
	    // もし変数foundの値がtrueの場合、以下を適用する。
	    if (found) {
	    	// コンソール画面に変数input"は配列に含まれています。"を表示する。
	        System.out.println(input + "は配列に含まれています。");
	    // 上記以外の場合、以下を適用する。
	    } else {
	    	// コンソール画面に"この数値は配列に含まれていません。"と表示する。
	        System.out.println("この数値は配列に含まれていません。");
	    }
	    
	    // スキャナーを閉じる
	    scanner.close();
	    System.out.println();
	    
		/*----------------------------------
	    [概要] 2次元配列の全要素を表示する
	    [詳細] 拡張for文で2次元配列を走査し、各要素を出力
	   ----------------------------------*/
	    // 型に変数を設定し、２次元配列に代入する。
	    int[][] array = {{1, 2}, {3, 4}, {5, 6}};
	    // 
	    for (int[] row : array) {
	        for (int element : row) {
	            System.out.print(element + " ");
	        }
	        System.out.println(); // 行ごとに改行
	    }	
	
		/*----------------------------------
	    [概要] 2次元配列の要素の合計値を求めて表示する
	    [詳細] 2重ループで各要素にアクセスし、合計を計算して表示
	   ----------------------------------*/
	    array = new int[][] {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
        sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        System.out.println("すべての要素の合計は：" + sum);
	    
		/*----------------------------------
	    [概要] 2次元配列の最大値・最小値を求める
	    [詳細] 配列内のすべての値を調べ、最大・最小を判定して表示する
	   ----------------------------------*/
        array = new int[][] {{12, 15, 8}, {6, 19, 25}, {30, 2, 10}};
        max = array[0][0];
        min = array[0][0];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                max = (array[i][j] > max) ? array[i][j] : max;
                min = (array[i][j] < min) ? array[i][j] : min;
            }
        }

        System.out.println("最大値: " + max);
        System.out.println("最小値: " + min);
	
		/*----------------------------------
	    [概要] 3次元配列の全要素を表示する
	    [詳細] 3重ループで各次元をたどり、すべての要素を出力する
	   ----------------------------------*/
        int[][][] array1 = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}};
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                for (int k = 0; k < array1[i][j].length; k++) {
                    System.out.print(array1[i][j][k] + " ");
                }
            }
        }
	}
}
