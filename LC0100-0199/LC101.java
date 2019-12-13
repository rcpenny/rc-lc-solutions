// Symmetric Tree

@EASY
public class LC101 {
  
  @DivideConquer
  @TopDown
  public boolean isSymmetric(TreeNode root) {
    return mirrorCompare(root, root);
  }

  private boolean mirrorCompare(TreeNode a, TreeNode b) {
    if (a == null && b == null) return true;
    if (a == null || b == null) return false;

    if (a.val != b.val) return false;

    return mirrorCompare(a.left, b.right) && mirrorCompare(a.right, b.left);
  }
}



