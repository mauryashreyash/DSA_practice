import java.util.*;

class LFUCache {

    class Node {
        int key, val, freq;
        Node prev, next;

        Node(int k, int v) {
            key = k;
            val = v;
            freq = 1;
        }
    }

    class DLL {
        Node head = new Node(0,0);
        Node tail = new Node(0,0);
        int size = 0;

        DLL() {
            head.next = tail;
            tail.prev = head;
        }

        void add(Node node) {
            Node next = head.next;
            head.next = node;
            node.prev = head;
            node.next = next;
            next.prev = node;
            size++;
        }

        void remove(Node node) {
            node.prev.next = node.next;
            node.next.prev = node.prev;
            size--;
        }

        Node removeLast() {
            if (size > 0) {
                Node last = tail.prev;
                remove(last);
                return last;
            }
            return null;
        }
    }

    int capacity, minFreq;
    Map<Integer, Node> map = new HashMap<>();
    Map<Integer, DLL> freqMap = new HashMap<>();

    public LFUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        if (!map.containsKey(key)) return -1;
        Node node = map.get(key);
        update(node);
        return node.val;
    }

    public void put(int key, int value) {
        if (capacity == 0) return;

        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.val = value;
            update(node);
        } else {
            if (map.size() == capacity) {
                DLL list = freqMap.get(minFreq);
                Node evict = list.removeLast();
                map.remove(evict.key);
            }

            Node node = new Node(key, value);
            minFreq = 1;

            DLL list = freqMap.getOrDefault(1, new DLL());
            list.add(node);
            freqMap.put(1, list);

            map.put(key, node);
        }
    }

    private void update(Node node) {
        int freq = node.freq;
        DLL list = freqMap.get(freq);
        list.remove(node);

        if (freq == minFreq && list.size == 0) minFreq++;

        node.freq++;

        DLL newList = freqMap.getOrDefault(node.freq, new DLL());
        newList.add(node);
        freqMap.put(node.freq, newList);
    }
}
