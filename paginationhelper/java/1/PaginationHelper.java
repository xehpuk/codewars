import java.util.List;

public class PaginationHelper<I> {
  private final int itemCount;
  private final int itemsPerPage;
  private final int pageCount;
  
  public PaginationHelper(final List<I> items, final int itemsPerPage) {
    this(items.size(), itemsPerPage);
  }
  
  public PaginationHelper(final int itemCount, final int itemsPerPage) {
    this.itemCount = itemCount;
    this.itemsPerPage = itemsPerPage;
    pageCount = (int) Math.ceil(itemCount / (double) itemsPerPage);
  }

  public int itemCount() {
    return itemCount;
  }

  public int pageCount() {
    return pageCount;
  }

  public int pageItemCount(final int pageIndex) {
    final int lastPageIndex = pageCount - 1;
    if (pageIndex < 0 || pageIndex > lastPageIndex) {
      return -1;
    }
    if (pageIndex < lastPageIndex) {
      return itemsPerPage;
    }
    return itemCount - itemsPerPage * lastPageIndex;
  }

  public int pageIndex(final int itemIndex) {
    if (itemIndex < 0 || itemIndex >= itemCount) {
      return -1;
    }
    return itemIndex / itemsPerPage;
  }
}