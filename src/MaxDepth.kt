
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

data class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

fun maxDepth(root: TreeNode?): Int {
    var maxDepth = 0
    searchDepth(root?)
    return 0
}

fun searchDepth(node: TreeNode?, maxDepth: Int) {

}