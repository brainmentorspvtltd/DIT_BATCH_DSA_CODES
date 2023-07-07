public class TriesDefinition {
    static class Node{
        Node[] children;
        boolean IsTerminal;

        public Node(){
            children = new Node[26];
            for(int i=0;i<26;i++){
                children[i] = null;
            }
            IsTerminal = false;

        }
    }

    static Node root = new Node();

    public static void main(String[] args) {
        
    }
}
