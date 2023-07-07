public class InsertionInTries {
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

    static void insert(String word){
        Node current = root;
        for(int i=0;i<word.length();i++){
            int index = word.charAt(i) - 'a';
            if(current.children[index] == null){
                current.children[index] = new Node();
            }

            if(i==word.length()-1){
                current.children[index].IsTerminal = true;
                System.out.println("WORD INSERTED :" + word);
             }
            current = current.children[index];
        }
    }

    public static void main(String[] args) {
        insert("apple");
    } 
}
