package Trees.BST;

import java.util.Scanner;

public class BinarySearchTree {
	private static Scanner scr;

	public static void main(String[] args){
		BinaryTreeNode root = null;
		BST_Operations BST_Op = new BST_Operations();
		scr = new Scanner(System.in);
		int choice;int n=0;
		while(true){
			System.out.println(" 1.Insert\n 2.Delete\n 3.Display\n 4.InOrder\n 5.PreOrder\n 6.PostOrder\n 7.Exit\n ");
			choice = scr.nextInt();
			switch(choice){
				case 1: System.out.println("Enter the number to insert");
						n = scr.nextInt();
						root = BST_Op.insert(root,n);
						break;
				case 2: System.out.println("Not implemented");
						break;
				case 3: System.out.println("Display");
				 		break;
				case 4: BST_Op.inOrder(root);
						break;
				case 5: BST_Op.preOrder(root);
						break;
				case 6: BST_Op.postOrder(root);
						break;
				case 7: System.exit(0);
			} 
		}
	}
}
