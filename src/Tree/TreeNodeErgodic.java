package Tree;

import com.sun.istack.internal.logging.Logger;
import lombok.extern.slf4j.Slf4j;
import sun.rmi.runtime.Log;

import java.util.LinkedList;

/**
 * @Author Mochi
 * @Description TODO 二叉树遍历
 * @Date 2019/7/2 21:01
 * @Name TreeNode
 */
@Slf4j
public class TreeNodeErgodic {
    /**
     * 二叉树遍历： 前序遍历--根节点、左子树、右子树
     *            中序遍历--左子树、根节点、右子树
     *            后序遍历--左子树、右子树、根节点
     **/
    static Logger logger = Logger.getLogger(TreeNodeErgodic.class);

    /**
     * 二叉树节点
     */
    private static class TreeNode{
        int data;
        TreeNode leftChild;
        TreeNode rightChild;

        TreeNode(int data){
            this.data = data;
        }
    }

    /**
    *@Author Mochi
    *@Description TODO 构建二叉树
    *@Date 21:06 2019/7/2
    *@Param [inputList]  输入序列
    *@Return Tree.TreeNodeErgodic.TreeNode
    **/
    public static TreeNode createBinaryTree(LinkedList<Integer> inputList){
        TreeNode node = null;
        if (inputList == null && inputList.size()==0) return null;

        Integer data = inputList.removeFirst();

        if (data!=null){
            node = new TreeNode(data);
            node.leftChild = createBinaryTree(inputList);
            node.rightChild = createBinaryTree(inputList);
        }
        return node;
    }


    public static void preOrderTraveral(TreeNode node){
        if (node == null) return;



    }

    public static void main(String[] args) {
        logger.info("123456");
    }
}
