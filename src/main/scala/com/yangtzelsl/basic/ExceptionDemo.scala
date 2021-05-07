package com.yangtzelsl.basic

import java.io.{FileNotFoundException, FileReader, IOException}

/**
 *
 * @Description: ExceptionDemo
 * @Author luis.liu
 * @Date: 2021/5/7 20:06
 * @Version 1.0
 */
object ExceptionDemo {
  def main(args: Array[String]) {
    // throw new IllegalArgumentException
  }

  def tryCatchMethod(): Unit = {
    try {
      val f = new FileReader("input.txt")
    } catch {
      case ex: FileNotFoundException => {
        println("Missing file exception")
      }
      case ex: IOException => {
        println("IO Exception")
      }
    }
  }

  def tryCatchFinallyMethod(): Unit = {
    try {
      val f = new FileReader("input.txt")
    } catch {
      case ex: FileNotFoundException => {
        println("Missing file exception")
      }
      case ex: IOException => {
        println("IO Exception")
      }
    } finally {
      println("Exiting finally...")
    }
  }
}
