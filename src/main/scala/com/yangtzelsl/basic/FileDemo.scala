package com.yangtzelsl.basic

import java.io.{File, PrintWriter}
import scala.io.{Source, StdIn}

/**
 *
 * @Description: FileDemo
 * @Author luis.liu
 * @Date: 2021/5/7 20:11
 * @Version 1.0
 */
object FileDemo {

  def main(args: Array[String]): Unit = {

  }

  def screenInput(): Unit = {
    print("请输入菜鸟教程官网 : ")
    val line = StdIn.readLine()

    println("谢谢，你输入的是: " + line)
  }

  def fileIuput(): Unit = {
    println("文件内容为:")

    Source.fromFile("test.txt").foreach {
      print
    }
  }

  def fileWriter(): Unit = {
    val writer = new PrintWriter(new File("test.txt"))

    writer.write("文件写入...")
    writer.close()
  }

}
