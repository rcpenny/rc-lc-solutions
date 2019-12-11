// Binary Tree Inorder Traversal

@MEDIUM
public class LC94 {

  @Iterative
  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    Stack<TreeNode> stack = new Stack<>();

    pushToStack(root, stack);

    while (!stack.isEmpty()) {
      TreeNode node = stack.pop();
      result.add(node.val);

      if (node.right != null) {
        pushToStack(node.right, stack);
      }
    }

    return result;
  }

  private void pushToStack(TreeNode node, Stack<TreeNode> stack) {
    while (node != null) {
      stack.push(node);
      node = node.left;
    }
  }
}