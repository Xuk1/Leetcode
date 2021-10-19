class WordDictionary {
    class Node {
        Node[] tns = new Node[26];
        boolean isWord;
    }
    Node root = new Node();
    public void addWord(String s) {
        Node p = root;
        for (int i = 0; i < s.length(); i++) {
            int u = s.charAt(i) - 'a';
            if (p.tns[u] == null) p.tns[u] = new Node();
            p = p.tns[u];
        }
        p.isWord = true;
    }
    public boolean search(String s) {
        return dfs(s, root, 0);
    }
    boolean dfs(String s, Node p, int sIdx) {
        int n = s.length();
        if (n == sIdx) return p.isWord;
        char c = s.charAt(sIdx);
        if (c == '.') {
            for (int j = 0; j < 26; j++) {
                if (p.tns[j] != null && dfs(s, p.tns[j], sIdx + 1)) return true;
            }
            return false;
        } else {
            int u = c - 'a';
            if (p.tns[u] == null) return false;
            return dfs(s, p.tns[u], sIdx + 1);
        }
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */

/*
执行用时: 41 ms ,在所有Java提交中击败了61.58%的用户
内存消耗:48.9 MB，在所有Java提交中击败了 66.36%的用户

使用了前缀树TrieNode
*/
