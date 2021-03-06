// Merge k Sorted Lists 合并K个排序链表

@HARD
public class Solution {
  
  @Heap
	@LinkedList
  public ListNode mergeKLists(ListNode[] lists) {
    ListNode dummy = new ListNode(0);
    ListNode tail = dummy;

    PriorityQueue<ListNode> heap = new PriorityQueue<>((a, b) -> {
      return a.val - b.val;
    });

    for (ListNode head : lists)
      if (head != null) heap.offer(head);
    
    while (!heap.isEmpty()) {
      ListNode tmp = heap.poll();
      
      tail.next = tmp;
      tail = tmp;

      if (tmp.next != null) heap.offer(tmp.next);
    }

    return dummy.next;
  }
}


