 public class BinarySearchTree{
    public node root;
    
    public BinarySearchTree(){
        root=null;
    }
    public  void insert(int num){
        node newNode=new node();
        newNode.data=num;
        if(root==null){
            root=newNode;
        }
        else{
            node current=new node();
            current=root;
            node parent;
            while(true){
                parent=current;
                if (num <current.data)
                    {
                    current=current.left;
                
                if(current==null){
                    parent.left=newNode;
                    break;
                }
                }
                else{
                    current=current.right;
                    if(current==null){
                        parent.right=newNode;
                        break; 
                    }
                }
            
            }
        }
    }
     public void inorder(){
         inorder(root);
     }
     public void inorder(node root){
         if(root!=null){
                 inorder(root.left);
                 System.out.println(root.data+" ");
                 inorder(root.right);
             
         }
         
     }
     public void preorder(){
         preorder(root);
     }
     public void preorder(node root){
         node current=root;
         if(current!=null){
         System.out.println(current.data);
             preorder(current.left);
             preorder(current.right);
         }
         }
     public void max(){
         node current =root;
         while(current.right!=null){
             current=current.right;
            
             
         }
         System.out.println("The maximum value in Binary Search Tree="+current.getdata());
         
     }
          public void min(){
         node current =root;
         while(current.left!=null){
             current=current.left;
             
         }
         System.out.println("The minimum value in Binary Search Tree="+current.getdata());
         
     }
 }