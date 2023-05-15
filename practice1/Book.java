import java.util.*;

public class Book implements Comparable<Book> {
  private String title;
  private Date publishDate;
  private String comment;

  // equalsメソッドのオーバーライド
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o == null) {
      return false;
    }
    if (!(o instanceof Book)) {
      return false;
    }
    Book b = (Book)o;
    if (!this.title.equals(b.title)) {
      return false;
    }
    if (!this.publishDate.equals(b.publishDate)) {
      return false;
    }
    return true;
  }

  // hashCodeメソッドのオーバーライド
  public int hashCode() {
    return Object.hash(this.title, this.publishDate, this.comment);
  }

  // 自然順序付けの定義
  public int compareTo(Book obj) {
    return this.publishDate.compareTo(obj.publishDate);
  }

  // 深いコピー
  public Book clone() {
    Book result = new Book();
    result.title = this.title;
    result.publishDate = this.publishDate.clone();
    result.comment = this.comment;
    return result;
  }
}