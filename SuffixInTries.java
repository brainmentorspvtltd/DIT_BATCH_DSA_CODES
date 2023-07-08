public class SuffixInTries {
    static class Node{
        Node[] children;
        boolean isTerminal;

        public Node(){
            children = new Node[26];
            for(int i=0;i<26;i++){
                children[i] = null;
            }
            isTerminal = false;
        }
    }
    static Node root = new Node();

    static void insert(String word){
        Node current = root;
        for(int i=0;i<word.length(); i++){
            int index = word.charAt(i) - 'a';
            if(current.children[index] == null){
                current.children[index] = new Node();
            }

            if(i==word.length()-1){
                current.children[index].isTerminal = true;
                System.out.println("WORD IS INSERTED : " + word );
            }

            current = current.children[index];
        }
    }

    static void insertSuffix(String word){
        for(int i=0;i<word.length(); i++){
            String suffix = word.substring(i);
            insert(suffix);
        }
    }

    public static void main(String[] args) {
        insertSuffix("brain");
        // System.out.println(insert("brain"));
    }
}
