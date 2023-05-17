import java.util.*;
import org.apache.commons.lang3.builder.*;

public class Book implements Comparable<Book> {
  private String title;
  private Date publishDate;
  private String comment;

  // ゲッターとセッター
  public String getTitle() {
    return this.title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  public Date getPublishDate() {
    return this.publishDate;
  }
  public void setPublishDate(Date publishDate) {
    this.publishDate = publishDate;
  }

  public String getComment() {
    return this.comment;
  }
  public void setComment(String comment) {
    this.comment = comment;
  }

  // // equalsメソッドのオーバーライド
  // public boolean equals(Object o) {
  //   if (o == this) {
  //     return true;
  //   }
  //   if (o == null) {
  //     return false;
  //   }
  //   if (!(o instanceof Book)) {
  //     return false;
  //   }
  //   Book b = (Book)o;
  //   if (!this.title.equals(b.title)) {
  //     return false;
  //   }
  //   if (!this.publishDate.equals(b.publishDate)) {
  //     return false;
  //   }
  //   return true;
  // }

  // commons-langを使ったequalsのオーバーライド
  public boolean equals(Object o) {
    return EqualsBuilder.reflectionEquals(this, o);
  }

  // hashCodeメソッドのオーバーライド
  // public int hashCode() {
  //   return Objects.hash(this.title, this.publishDate, this.comment);
  // }

  // commons-langを使ったhashCodeのオーバーライド
  public int hashCode() {
    return HashCodeBuilder.reflectionHashCode(this);
  }

  // // 自然順序付けの定義
  // public int compareTo(Book obj) {
  //   return this.publishDate.compareTo(obj.publishDate);
  // }

  // commons-langを使ったcompareToのオーバーライド
  public int compareTo(Book obj) {
    return CompareToBuilder.reflectionCompare(this, obj, "comment", "title");
  }

  // 深いコピー
  public Book clone() {
    Book result = new Book();
    result.title = this.title;
    result.publishDate = (Date)this.publishDate.clone();
    result.comment = this.comment;
    return result;
  }
}