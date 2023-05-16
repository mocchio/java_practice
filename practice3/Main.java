public class Main {
  public static void main(String[] args) {
    FuncList funclist = new FuncList();
    // 関数の代入
    Func1 f1 = FuncList::isOdd;
    Func2 f2 = funclist::passCheck;
    // 関数の呼び出し
    System.out.println(f1.call(15));
    System.out.println(f2.call(66, "ジョン"));
  }
}