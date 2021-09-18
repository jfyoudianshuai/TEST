package suanfa.easy;


import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import nodeandtree.BuildTree;
import nodeandtree.TreeNode;

public class No606 {
    public static String tree2str(TreeNode root) {
        StringBuilder sb=new StringBuilder();
        addString(sb,root);
        return sb.substring(1,sb.length()-1);
    }

    private static void addString(StringBuilder sb, TreeNode root) {
        if(root==null) {sb.append("()"); return;}
        sb.append("(");
        sb.append(root.val);
        //有一边不为空 都要加左边
        if(root.left!=null || root.right!=null)
        addString(sb,root.left);
        //右边不为空 才加右边
        if(root.right!=null) {
            addString(sb, root.right);
        }
        sb.append(")");
    }

    public static void main(String[] args) {
        TreeNode node= BuildTree.build(new Integer[]{1,2,3,null,4});
        System.out.println(tree2str(node));
    }
}
