public class StrongBox<E> {
  private E item;
  // 鍵の種類を表すフィールド
  private KeyType keyType;
  // 金庫が呼び出される回数を表すフィールド
  private long count;

  // 鍵の種類を受け取るコンストラクタ
  public KeyType(KeyType keyType) {
    this.keyType = keyType;
  }

  public void put(E i) {
    this.item = i;
  }

  // itemを取り出すための鍵に関するメソッド
  public E get() {
    this.count++;
    switch (this.keyType) {
      case PADLOCK:
        if (count < 1024) return null;
        break;
      case BUTTON:
        if (count < 10000) return null;
        break;
      case DIAL:
        if (count < 30000) return null;
        break;
      case FINGER:
        if (count < 1000000) return null;
        break;
    }
    this.count = 0;
    return this.item;
  }
}