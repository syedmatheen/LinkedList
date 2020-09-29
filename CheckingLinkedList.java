import java.util.Iterator;
import java.util.LinkedList;

public class CheckingLinkedList {
	public static void main(String args[]) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("syed");
		list.add("Suresh");
		list.add("Rajesh");

		list.addFirst("Rajan");

		list.add(2, "Ramesh");

		list.addLast("Mahesh");

		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			 System.out.println(iterator.next());
		}

		list.remove(1);

		Iterator<String> iterator2 = list.iterator();
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
	}

}
