import common.TreeNode
import kotlin.math.max

// https://leetcode.com/problems/maximum-depth-of-binary-tree/

/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

fun maxDepth(root: TreeNode?): Int {
    if(root == null) {
        return 0
    }

    val leftDepth = findMaxDepth(root.left, 1)
    val rightDepth = findMaxDepth(root.right, 1)
    return max(leftDepth, rightDepth)
}

private fun findMaxDepth(node: TreeNode?, maxDepth: Int) : Int {
    if(node == null) {
        return maxDepth
    }

    val leftCurrentDepth = findMaxDepth(node.left, maxDepth + 1)
    val rightCurrentDepth = findMaxDepth(node.right, maxDepth + 1)
    return max(leftCurrentDepth, rightCurrentDepth)
}
