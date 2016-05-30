package Citadel;

import java.util.Stack;

public class InorderTraversalWithoutRecurssion {
	class TreeNode
	{
		int data;
		TreeNode left, right;
		TreeNode(int d)
		{
			this.data = d;
			this.left = null;
			this.right = null;
		}
	}
	static TreeNode root;
	public static void main(String[] args) {
		InorderTraversalWithoutRecurssion i = new InorderTraversalWithoutRecurssion();
		root = i.new TreeNode(1);
		root.left = i.new TreeNode(2);
        root.right = i.new TreeNode(3);
        root.left.left = i.new TreeNode(4);
        root.left.right = i.new TreeNode(5);
        i.inorder();
	}
	void inorder() {
		if (root == null) {
			return;
		}

		//keep the nodes in the path that are waiting to be visited
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode node = root;

		//first node to be visited will be the left one
		while (node != null) {
			stack.push(node);
			node = node.left;
		}

		// traverse the tree
		while (stack.size() > 0) {

			// visit the top node
			node = stack.pop();
			System.out.print(node.data + " ");
			if (node.right != null) {
				node = node.right;

				// the next node to be visited is the leftmost
				while (node != null) {
					stack.push(node);
					node = node.left;
				}
			}
		}
	}
}
