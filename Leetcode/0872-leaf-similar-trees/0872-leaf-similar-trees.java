
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        // 리프 노드 저장 리스트
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        leafSimilarTree(root1, list1);
        leafSimilarTree(root2, list2);

        return list1.equals(list2);
    }

    public void leafSimilarTree(TreeNode root, List<Integer> list){
        if(root == null) return;
        if(root.left == null && root.right == null){
            list.add(root.val);
        }
        leafSimilarTree(root.left, list);
        leafSimilarTree(root.right, list);
    }
}
