// Binary Tree Preorder Traversal 二叉树的前序遍历

@MEDIUM
public class LC144 {

  @Recursive
  public List<Integer> preorderTraversal1(TreeNode root) {
    List<Integer> result = new ArrayList<>();

    traverse(root, result);
    return result;
  }

  private void traverse(TreeNode node, List<Integer> result) {
    if (node == null) return;

    result.add(node.val);
    traverse(node.left, result);
    traverse(node.right, result);
  }


	// 前序遍历： 中 左 右 （出栈顺序）
  @Iterative
  public List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<>();
		if (root == null) return result;

    Stack<TreeNode> stack = new Stack<>();
		stack.push(root);

    while (!stack.isEmpty()) {
			TreeNode tmp = stack.pop();

			result.add(tmp.val);
			if (tmp.right != null) stack.push(tmp.right);
			if (tmp.left != null) stack.push(tmp.left);
    }

    return result;
  }
}
