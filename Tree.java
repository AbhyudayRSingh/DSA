class Tree{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static int idx=-1;
    public static Node buildTree(int nodes[]){
        idx++;
        if(nodes[idx]==-1){
            return null;
        }
        Node newNode=new Node(nodes[idx]);
        newNode.left=buildTree(nodes);
        newNode.right=buildTree(nodes);
        return newNode;
    }
    public static void main(String args[]){
        int nodes[]={1,2,3,-1,-1,4,-1,-1,7,-1,-1};
        Node root=buildTree(nodes);
        System.out.println(root.data);
    }
}