object Lists {
  /**
   * This method returns the largest element in a list of integers. If the
   * list `xs` is empty it throws a `java.util.NoSuchElementException`.
   *
   * @param xs A list of natural numbers
   * @return The largest element in xs
   * @throws java.util.NoSuchElementException if xs is an empty list
   */
  def max(xs: List[Int]): Int = {
    def loop(maxVal: Int, xs: List[Int]): Int = {
      if(xs.isEmpty) maxVal
      else loop( if(xs.head > maxVal) xs.head else maxVal, xs.tail )
    }

    if(xs.isEmpty) throw new NoSuchElementException
    else loop(xs.head, xs.tail)
  }
}