package main

import "fmt"

type ListNode struct {
    Val int
    Next *ListNode
}

func getListNode(ints ...int) *ListNode {
    var re *ListNode = &ListNode{ints[0], nil}
    prev := re
    for i, n := 1, len(ints); i < n; i++ {
        prev.Next = &ListNode{ints[i], nil}
        prev = prev.Next
    }
    return re
}

func printListNode(nodes ...*ListNode)  {
    for _, node := range nodes {
        for node != nil {
            fmt.Print(node.Val)
            fmt.Print("\t")
            node = node.Next;
        }
        fmt.Print("\n")
    }
}
//go build ListNode.go && ListNode && go clean
func main()  {
    printListNode(getListNode(1, 5, 6, 2), getListNode(7, 8, 6, 2))
}
