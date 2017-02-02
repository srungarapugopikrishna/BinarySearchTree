package Trees.BST;

public class BST_Operations {
	public BinaryTreeNode insert(BinaryTreeNode root, int value){
		if(root == null){
			root = new BinaryTreeNode(value);
		}else{
			BinaryTreeNode temp = root;
			if(value < temp.value){
				if(temp.left == null){
					System.out.println("Inserted to the left of "+temp.value);
					temp.left = new BinaryTreeNode(value);
				}else{
					insert(temp.left,value);
				}
			}else if(value > temp.value){
				if(temp.right == null){
					System.out.println("Inserted to the right of "+temp.value);
					temp.right = new BinaryTreeNode(value);
				}else{
					insert(temp.right,value);
				}
			}else{
				System.out.println("Value Already Exists");
			}
		}
		return root;
		
	}

	public void inOrder(BinaryTreeNode node) {
		if(node.left != null){
			inOrder(node.left);
		}
		display(node);
		if(node.right != null){
			inOrder(node.right);
		}
	}

	private void display(BinaryTreeNode node) {
		if(node!=null){
			System.out.println(node.value);
		}
	}

	public void preOrder(BinaryTreeNode node) {
		display(node);
		if(node.left != null){
			inOrder(node.left);
		}
		if(node.right != null){
			inOrder(node.right);
		}
	}

	public void postOrder(BinaryTreeNode node) {
		if(node.left != null){
			inOrder(node.left);
		}
		if(node.right != null){
			inOrder(node.right);
		}
		display(node);
	}
}
