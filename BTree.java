public class BTree{
    public static void main(String[] args){
        BinarySearchTree numbers=new BinarySearchTree();
        numbers.insert(10);
        numbers.insert(15);
        numbers.insert(3);
        numbers.insert(18);
        numbers.insert(5);
        numbers.insert(4);
        numbers.insert(24);
        numbers.insert(8);
        numbers.inorder();
        System.out.println();
        numbers.preorder();
        numbers.min();
        numbers.max();
    }
}