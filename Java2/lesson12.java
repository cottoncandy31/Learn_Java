class Main {
  public static void main(String[] args) {
    // 変数languagesを定義し、配列を代入
    String[] languages = {"Ruby", "PHP", "Python"};
    
    // インデックス番号が「1」の要素を出力
    System.out.println(languages[1]);
    
    // インデックス番号が「1」の要素を「Java」で上書き
    languages[1] = "Java";
    
    // インデックス番号が「1」の要素を出力
    System.out.println(languages[1]);
    
  }
}