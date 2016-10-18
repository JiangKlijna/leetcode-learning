package main
// Given an array of integers, return indices of the two numbers such that they add up to a specific target.
// You may assume that each input would have exactly one solution.
// 给出一个int数组和目标值,从数组中找到两个值使得其和为目标值.返回两个下标位置.

func twoSum(nums []int, target int) []int {
  var MAP map[int] int = make(map[int] int)

  for i, count := 0, len(nums); i < count; i++ {
    v := nums[i]
    data, isNil := MAP[v]
    if isNil{
      if data<i {
        return []int{data, i}
      }
    } else{
      MAP[target-v] = i
    }
  }
  return []int{0, 0}
}
