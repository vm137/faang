package interviews.ynd.two;

import java.util.Iterator;
import java.util.function.Predicate;

class FilteringIterator<T> implements Iterator<T> {
  private final Predicate<T> predicate;
  private final Iterator<T> source;

  public FilteringIterator(Iterator<T> source, Predicate<T> predicate) {
    this.source = source;
    this.predicate = predicate;
  }

  private T temp = null;
  private boolean hasNext = false;

  @Override
  public boolean hasNext() {
    if (source.hasNext()) {
      while (source.hasNext()) {
        hasNext = true;
        temp = source.next();
        if (predicate.test(temp)) {
          return true;
        }
      }
      return false;
    } else {
      return false;
    }
  }

  //returns elements from source where #predicate is true
  @Override
  public T next() {
    if (temp != null) {
      hasNext = false;
      return temp;
    } else {
      while(source.hasNext()) {
        T el = source.next();
        if (predicate.test(el)) {
          return el;
        } else {
          source.next();
        }
      }
    }
    return null; // added
  }
}

// 1 2 3 0 4 5 0 6 7
// 1 2 3 _ 4 5 _ 6 7
