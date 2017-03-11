import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigzagIterator {
	
	private LinkedList<Iterator> queue;

    public ZigzagIterator(List<Integer> v1, List<Integer> v2) {
        queue = new LinkedList<Iterator>();
        if (v1.iterator().hasNext()) queue.addFirst(v1.iterator());
        if (v2.iterator().hasNext()) queue.addFirst(v2.iterator());
    }

    public int next() {
        Iterator i = queue.removeLast();
        int toReturn = (int) i.next();
        if (i.hasNext()) queue.addFirst(i);
        return toReturn;
    }

    public boolean hasNext() {
        return !queue.isEmpty();
    }
}

/**
 * Your ZigzagIterator object will be instantiated and called as such:
 * ZigzagIterator i = new ZigzagIterator(v1, v2);
 * while (i.hasNext()) v[f()] = i.next();
 */