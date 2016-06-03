//package patmat

object Practice
{;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(1561); 
  /*def listLen[A](input: List[A]): Int = {
  	def count(inp: List[A], acc: Int): Int = inp match {
  	case Nil => acc
  	case x :: xs => count(xs,acc+1)
		}
		count(input,0)
	}
	val test=List(1,1,2,2,3,4,4,5,5,5,6)
	def rev[T](input: List[T]): List[T] = input match{
		case Nil => Nil
		case x :: xs => rev(xs) ++ List(x)
	}
	rev(test)
	def concat[A](one: List[A], two: List[A]): List[A] = one match {
		case Nil => two
		case  x :: y => x :: concat(y,two)
	}
	concat(test,test)
	def penult[A](input: List[A]): A = input match {
		case x :: y :: Nil => x
		case x :: y => penult(y)
	}
	penult(test)
	def kthelem[A](input: List[A], k: Int): A = (input,k) match {
		case (Nil,_) => throw new NoSuchElementException
		case (x::y,0) => x
		case (x::y,some) => kthelem(y,k-1)
	}
	kthelem(test,4)
	def flatten(input: List[Any]): List[Any] = input match {
		case Nil => Nil
		case (h:List[_]) :: tail => flatten(h) ::: flatten(tail)
		case h :: tail => h :: flatten(tail)
	}
	flatten(test)
	test.flatMap( e => List(e))
	def dupRemove(input: List[Int]): List[Int] = input match {
		case Nil => Nil
		case x::List() => List(x)
		case x::y if(x==y.head) => dupRemove(y)
		case x::y => x :: dupRemove(y)
	}
	dupRemove(test)*/
	def runLENC(input: List[Char]): List[(Char,Int)] = {
		def accum(inp: List[Char], acc: Int): List[(Char,Int)] = inp match {
		case Nil => Nil
		case x :: Nil => List((x,acc))
		case x :: y if(x==y.head) => accum(y,acc+1)
		case x :: y => (x,acc) :: accum(y,1)
		//else x :: accum(y,1)
		}
		accum(input,1)
	};System.out.println("""runLENC: (input: List[Char])List[(Char, Int)]""");$skip(366); 
	def runLENC1(input: List[Char]): List[Either[Char,(Char,Int)]] = {
		def accum(inp: List[Char], acc: Int): List[Either[Char,(Char,Int)]] = inp match {
		case Nil => Nil
		case x :: Nil => List(Right((x,acc)))
		case x :: y if(x==y.head) => accum(y,acc+1)
		case x :: y => if(acc!=1) Right((x,acc)) :: accum(y,1)
		else Left(x) :: accum(y,1)
		}
		accum(input,1)
	};System.out.println("""runLENC1: (input: List[Char])List[Either[Char,(Char, Int)]]""");$skip(48); 
	val testchar=List('a','b','b','c','c','d','d');System.out.println("""testchar  : List[Char] = """ + $show(testchar ));$skip(20); val res$0 = 
	runLENC1(testchar);System.out.println("""res0: List[Either[Char,(Char, Int)]] = """ + $show(res$0))}
	
	
	
}
