package com.yangtzelsl.basic

import scala.collection.mutable

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

    mapIterator()
  }

  def mapIterator(): Unit = {
    // the result type of an implicit conversion must be more specific than Object
    val map = new mutable.HashMap[String, Any]()

    map.put("aab", 18)
    map.put("AAi", "hello")
    map.put("asK", true)
    map.put("yTn", 23.56)

    // 方式1：每次遍历先获取key
    for (key <- map.keys) {
      println(key.toLowerCase + "-->" + map(key))
    }

    // 方式2：每次获取其中一个元祖
    for (kv <- map) {
      println(kv._1.toLowerCase + "-->" + kv._2)
    }

    // 方式3：每次循环直接解析元祖（析构）
    for ((k, v) <- map) {
      println(k.toLowerCase + "-->" + v)
    }
  }
}
