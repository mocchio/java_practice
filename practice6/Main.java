import java.io.*;
import java.util.zip.GZIPOutputStream;

public class Main {
  public static void main(String[] args) {
    // // FileInputStreamとFileOutputStreamの利用
    // String inFile = args[0];
    // String outFile = args[1];

    // FileInputStream fis = new FileInputStream(inFile);
    // FileOutputStream fos = new FileOutputStream(outFile);

    // int i = fis.read();
    // while (i != -1) {
    //   fos.write(i);
    //   i = fis.read(); // 次のバイトの値を読み込み
    // }

    // fos.flush();
    // fos.close();
    // fis.close();

    // GZIPOutputStreamの利用
    String inFile = "2022/5/18 Javaテスト\n以上";
    String outFile = "/User/java_projects/java_test.txt";
    
    // 例外処理
    try (
      FileInputStream fis = new FileInputStream(inFile);
      FileOutputStream fos = new FileOutputStream(outFile);
      BufferedOutputStream bos = new BufferedOutputStream(fos);
      GZIPOutputStream gzos = new GZIPOutputStream(bos);
    ) {
      int i = fis.read();
      while (i != -1) {
        gzos.write(i);
        i = fis.read();
      }
      gzos.flush();
    } catch (IOException e) {
      System.out.println("ファイル処理に失敗しました");
    }
  }
}