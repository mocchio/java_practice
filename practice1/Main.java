import java.util.*;
import java.text.SimpleDateFormat;

public class Main {
  public static void main(String[] args) throws Exception {
    SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd");
    List<Book> books = new ArrayList<>();
    
    // 1冊目の本情報作成
    Book b1 = new Book();
    b1.setTitle("Java入門");
    b1.setPublishDate(f.parse("2011/10/07"));
    b1.setComment("スッキリわかる");
    books.add(b1);

    // 2冊目の本情報作成
    Book b2 = new Book();
    b2.setTitle("Python入門");
    b2.setPublishDate(f.parse("2019/06/11"));
    b2.setComment("カレーが食べたくなる");
    books.add(b2);

    // 3冊目の本情報作成
    Book b3 = new Book();
    b3.setTitle("C言語作成");
    b3.setPublishDate(f.parse("2018/06/21"));
    b3.setComment("ポインタも自由自在");
    books.add(b3);

    // 書名の昇順で並び替える（TitleComparatorクラス）
    Collections.sort(books, new TitleComparator());
    
    // 要素の取り出し
    for (Book b : books) {
      System.out.println("書名：" + b.getTitle() + " " + "発行日：" + f.format(b.getPublishDate()) + " " + "コメント：" + b.getComment());
    }
  }
}