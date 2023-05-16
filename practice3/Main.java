public class Main {
  public static void main(String[] args) {
    FuncList funclist = new FuncList();
    // 関数の代入
    // Func1 f1 = FuncList::isOdd;
    // Func2 f2 = funclist::passCheck;

    // ラムダ式での関数の代入
    Func1 f1 = x -> x % 2 == 1;
    Func2 f2 = (point, name) -> {
      return name + "さんは" + (point > 65 ? "合格" : "不合格");
    };
    // 関数の呼び出し
    System.out.println(f1.call(15));
    System.out.println(f2.call(66, "ジョン"));
  }
}