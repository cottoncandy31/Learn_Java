class Main {
  public static void main(String[] args) {
    // 変数nameに、好きな名前を代入
    String name = "Hanako";
    
    // 変数ageに、好きな年齢を代入
    int age = 20;
    
    // 変数heightに、好きな身長を代入
    double height = 1.6;
    
    // 変数weightに、好きな体重を代入
    double weight = 50.2;
    
    // 変数bmiに、BMIを計算して代入
    double bmi = weight / height / height;
    
    // 名前、年齢、身長、体重、BMIに関する情報を出力
    System.out.println("名前は" + name + "です");
    System.out.println("年齢は" + age + "歳です");
    System.out.println("身長は" + height + "mです");
    System.out.println("体重は" + weight + "kgです");
    System.out.println("BMIは" + bmi + "です");
  }
}