import java.util.Comparator;

// 書名（title）を昇順で並び替える場合のコンパレーター
public class TitleComparator implements Comparator<Book> {
  public int compare(Book x, Book y) {
    return x.getTitle().compareTo(y.getTitle());
  }
}