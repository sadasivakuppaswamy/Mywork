package javaexamples;

/**
 * Created by Sadasiva.Kuppaswamy on 06-05-2016.
 */
public class ConstructBinaryTreeFromInorderAndPostOrderTraversal {
    public static void main(String[] args) {
        new ConstructBinaryTreeFromInorderAndPostOrderTraversal();
    }

    public ConstructBinaryTreeFromInorderAndPostOrderTraversal() {
        int inOrder[] =   {20, 30, 35, 40, 45, 50, 55, 60, 70};
        int postOrder[] = {20, 35, 30, 45, 40, 55, 70, 60, 50};

        Node n = constructTree(inOrder, postOrder);
       /* while (n.getLeft()!=null){
            System.out.println(n.getData());
            System.out.print(n.getLeft().getData()+"<==");
            System.out.println("==>" + n.getRight().getData());
            n=n.getLeft();

        }*/
      //  displayNodes(n);

    }
    public void displayNodes(Node node){
        System.out.println(node.getData());
        if(node.getLeft()!=null){
          //
            displayNodes(node.getLeft());
            System.out.print("==>");
        }
        if(node.getRight()!=null){
           // System.out.println(node.getData());
            displayNodes(node.getRight());
            System.out.print("<==");
        }

    }
    public void displaySpace(int number){
        while (number>0){
            System.out.println(" ");
        }
    }


    private static Node constructTree(int[] inOrder, int[] preorder) {
        return constructTreeFromInOrderAndPostOrder(inOrder, 0, inOrder.length-1, preorder, 0, preorder.length-1);
    }

    private static Node constructTreeFromInOrderAndPostOrder(int[] inOrder, int inStart, int inEnd, int[] postOrder, int postStart, int postEnd) {
        if(postStart > postEnd){
            return null;
        }

        Node node = new Node(postOrder[postEnd]);

        int index=0;
        for (int i = inStart; i <= inEnd; i++) {
            //System.out.print(" ");
            if(postOrder[postEnd]==inOrder[i]){
                index = i;

                break;
            }
        }
       // System.out.println(inOrder[index]);
        int numberOfNodes = index - inStart;

        node.setLeft(constructTreeFromInOrderAndPostOrder(inOrder, inStart, index - 1, postOrder, postStart, (postStart + numberOfNodes) - 1));
        node.setRight(constructTreeFromInOrderAndPostOrder(inOrder, index + 1, inEnd, postOrder, postStart + numberOfNodes, postEnd - 1));
        //System.out.println(node.getData());
        return node;
    }

}
