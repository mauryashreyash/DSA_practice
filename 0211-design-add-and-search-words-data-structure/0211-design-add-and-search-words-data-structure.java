class WordDictionary {

    class Node {
        Node[] children = new Node[26];
        boolean isWord;
    }

    Node root;

    public WordDictionary() {
        root = new Node();
    }

    public void addWord(String word) {
        Node curr = root;

        for (char ch : word.toCharArray()) {
            int index = ch - 'a';

            if (curr.children[index] == null) {
                curr.children[index] = new Node();
            }

            curr = curr.children[index];
        }

        curr.isWord = true;
    }

    public boolean search(String word) {
        return search(word, 0, root);
    }

    private boolean search(String word, int index, Node curr) {
        if (index == word.length()) {
            return curr.isWord;
        }

        char ch = word.charAt(index);

        if (ch != '.') {
            Node next = curr.children[ch - 'a'];

            if (next == null) {
                return false;
            }

            return search(word, index + 1, next);
        }

        for (Node next : curr.children) {
            if (next != null && search(word, index + 1, next)) {
                return true;
            }
        }

        return false;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */