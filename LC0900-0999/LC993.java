// Cousins in Binary Tree 二叉树的堂兄弟节点

@EASY
public class LC993 {
	Map<Integer, Integer> depth;
	Map<Integer, TreeNode> parent;

	@DFS
	public boolean isCousins(TreeNode root, int x, int y) {
		depth = new HashMap();
		parent = new HashMap();

		dfs(root, null);
		
		return (depth.get(x) == depth.get(y) && parent.get(x) != parent.get(y));
	}

	public void dfs(TreeNode node, TreeNode par) {
		if (node == null) return;

		depth.put(node.val, par != null ? 1 + depth.get(par.val) : 0);
		parent.put(node.val, par);

		dfs(node.left, node);
		dfs(node.right, node);
	}
}