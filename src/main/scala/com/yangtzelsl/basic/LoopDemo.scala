package com.yangtzelsl.basic

/**
 *
 * @Description: LoopDemo
 * @Author luis.liu
 * @Date: 2021/5/7 18:11
 * @Version 1.0
 */
object LoopDemo {
  def main(args: Array[String]) {
    forMethod()
  }

  def whileMethod(): Unit = {
    var a = 10;
    // 无限循环
    while (true) {
      println("a 的值为 : " + a);
    }
  }

  def doWhileMethod(): Unit = {
    // 局部变量
    var a = 10;

    // do 循环
    do {
      println("Value of a: " + a);
      a = a + 1;
    } while (a < 20)
  }

  def forMethod(): Unit = {
    var a = 0;
    // for 循环
    for (a <- 1 to 10) {
      println("Value of a: " + a);
    }
  }

}
