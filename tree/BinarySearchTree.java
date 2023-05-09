package tree;

public class BinarySearchTree {
    private static TreeNode root;

    private class TreeNode{
        private int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data){
            this.data=data;
        }
    }

    public void insert(int value){
        root=insert(root, value);

    }

    public TreeNode insert(TreeNode root,int value){
        if(root==null){
            root=new TreeNode(value);
            return root;
        }
        if(value<root.data){
            root.left=insert(root.left,value);
        }else{
            root.right=insert(root.right,value);
        }
        return root;
    }

    public TreeNode search(int key){
        return search(root,key);
    }

    public TreeNode search(TreeNode root,int key){
        if(root==null || root.data==key){
            return root;
        }
        if(key<root.data){
            return search(root.left,key);
        }else{
            return search(root.right,key);
        }
    }

    public int closestValue(TreeNode root,double target){
        int closest=root.data;
        while(root!=null){
            if(Math.abs(target-root.data)<Math.abs(target-closest)){
                closest=root.data;
            }
            root=target<root.data?root.left:root.right;
        }
        return closest;
        
    }
    
    public boolean isValid(TreeNode root){
        return isValid(root,Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    public boolean isValid(TreeNode root,long min,long max){
        if(root==null){
            return true;
        }
        if(root.data<=min || root.data>=max){
            return false;
        }
        return isValid(root.left, min, root.data) && isValid(root.right, root.data, max);

    }

    public void inOrderRecursive(TreeNode root){
        if(root==null){
            return;
        }
        inOrderRecursive(root.left);
        System.out.print(root.data+" ");
        inOrderRecursive(root.right);
    }

    public TreeNode delete(TreeNode root,int value){
        if(root==null){
            return root;
        }
        if(value<root.data){
            root.left=delete(root.left, value);
        }else if(value>root.data){
            root.right=delete(root.right,value);
        }else{
            if(root.left==null && root.right==null){
                root=null;
            }else if(root.left==null){
                root=root.right;
            }else if(root.right==null){
                root=root.left;
            }else{
                TreeNode temp=findMin(root.right);
                root.data=temp.data;
                root.right=delete(root.right, temp.data);
            }
        }
        return root;
    }

    public TreeNode findMin(TreeNode root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
    public static void main(String[] args) {
        BinarySearchTree objBinarySearchTree= new BinarySearchTree();
        objBinarySearchTree.insert(10);
        objBinarySearchTree.insert(5);
        objBinarySearchTree.insert(3);
        objBinarySearchTree.insert(6);
        objBinarySearchTree.insert(15);
        objBinarySearchTree.insert(13);
        objBinarySearchTree.insert(18);

        if(null!=objBinarySearchTree.search(1)){
            System.out.println("Key found!!!");
        }else{
            System.out.println("Key not found!!!");
        }

        System.out.println(objBinarySearchTree.closestValue(root, 17));

        System.out.println(objBinarySearchTree.isValid(root));
        objBinarySearchTree.inOrderRecursive(root);

        objBinarySearchTree.delete(root, 13);
        System.out.println();
        objBinarySearchTree.inOrderRecursive(root);
                
    }
    
}
