package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if(c==r || c==0) 1 else pascal(c-1,r-1)+pascal(c,r-1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def check(chars: List[Char], acc: Int): Boolean = {
      if (chars.isEmpty) acc==0
      else
        if (chars.head == '(') check(chars.tail, acc+1)
        else 
          if (chars.head == ')') 
            if (acc>0) check(chars.tail, acc-1)
            else false
          else
            check(chars.tail, acc)
    }
    check(chars,0)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    def Count(M: Int, C: List[Int]): Int = {
                if(M == 0) 1
                else if(M < 0) 0
                else if(C.isEmpty && M>=1 ) 0
                else Count(M, C.tail) + Count(M - C.head, C)
    }

    Count(money, coins)
  }
}
