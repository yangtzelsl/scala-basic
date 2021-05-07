package com.yangtzelsl.basic

/**
 *
 * @Description: CollectionDemo
 * @Author luis.liu
 * @Date: 2021/5/7 18:16
 * @Version 1.0
 */
object CollectionDemo {
  def main(args: Array[String]): Unit = {
    // 定义整型 List
    val list = List(1, 1, 2, 3, 4)

    // 定义 Set
    val set = Set(1, 3, 5, 7)

    // 定义 Map
    val map = Map("one" -> 1, "two" -> 2, "three" -> 3)

    // 创建两个不同类型元素的元组
    val tuple = (10, "Runoob")

    // 定义 Option
    val option: Option[Int] = Some(5)

    println(list)
  }
}
