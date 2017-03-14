package main

import "fmt"

type TreeNode struct {
    Val int
    Left *TreeNode
    Right *TreeNode
}

func getTreeNode(ints ...int) *TreeNode {
    tns := make([]*TreeNode, len(ints))
    for i, n := 0, len(ints); i < n; i++ {
        tns[i] = &TreeNode{ints[i], nil, nil}
    }
    for i, n := 0, len(ints); i < n; i++ {
        left, right := 2*i+1, 2*i+2
        if left >= len(tns) {break}
        tns[i].Left = tns[left]
        if right >= len(tns) {break}
        tns[i].Right = tns[right]
    }
    return tns[0]
}

func printTreeNode(nodes ...*TreeNode)  {
    for _, node := range nodes {
        p(node)
        fmt.Print("\n")
    }
}

func p(tn *TreeNode)  {
    if tn == nil {return}
    fmt.Print("[")
    p(tn.Left)
    fmt.Print(tn.Val)
    p(tn.Right)
    fmt.Print("]")
}
//go build TreeNode.go && TreeNode && go clean
func main()  {
    printTreeNode(getTreeNode(1, 5, 6, 2), getTreeNode(7, 8, 6, 2))
}
