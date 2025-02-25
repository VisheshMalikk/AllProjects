package CollectionsFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {

	public static void main(String[] args) {
		
		// Thread-safe/Synchronized : At a time only one single thread is working on a particular object (syncList, list)

		// 1) First way to synchronized an ArrayList
		List<String> syncList = Collections.synchronizedList(new ArrayList<String>());
		syncList.add("Java");
		syncList.add("Python");
		syncList.add("Ruby");
		
		// Add, Remove - We don't need explicit synchronization
		
		// But to fetch/traverse the values from this list -- we have to use explicit synchronization
		
		synchronized (syncList) { // Now this ArrayList(syncList) is a synchronized ArrayList
			Iterator<String> it = syncList.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		}
		
		System.out.println("---------------------------------------------------");
		
		// 2) Second way to synchronized an ArrayList : CopyOnWriteArrayList : Its a class -- Thread-safe/synchronized already
		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();
		
		list.add("Tom");
		list.add("Steve");
		list.add("Vishesh");
		
		// We don't need explicit synchronization for any operations like : Add item, Set item, Remove item, Traversing items etc
		 Iterator<String> it = list.iterator();
		 while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
