import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    // // プロパティファイルの読み取り
    // Reader fr = new FileReader("pref.properties");
    // Properties p = new Properties();
    // p.load(fr);
    // System.out.println(p.getProperty("aichi.capital") + ":" + p.getProperty("aichi.food"));
    // fr.close();

    // ResourceBundleを利用したプロパティファイルの読み取り
    // クラスパスを起点に読み取り
    ResourceBundle rb = ResourceBundle.getBundle("pref"); // 「.properties」は記述しない
    System.out.println(rb.getString("aichi.capital") + ":" + rb.getString("aichi.food"));
  }
}