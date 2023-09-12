class Main {
  public static void main(String[] args) {
    // 条件式に直接trueをいれる
    if (true) {
      System.out.println("条件式がtrueのため、出力されます");
    }

    // 条件式に直接falseをいれる
    if (false) {
      System.out.println("条件式がfalseのため、出力されません");
    }

    int x = 5;
    // if文を用いて、変数xが2より大きいとき「xは2より大きい」と出力
    if (x > 2) {
      System.out.println("xは2より大きい");
    }
    // if文を用いて、変数xが8より大きいとき「xは8より大きい」と出力
    if (x > 8) {
      System.out.println("xは8より大きい");
    }

  }
}