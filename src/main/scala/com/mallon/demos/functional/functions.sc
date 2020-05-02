val doubleIt = (n: Int) => n * 2
doubleIt.isInstanceOf[Function1[Int, Int]]

doubleIt(15)

def defDoubleIt(n: Int) = n * 2
//defDoubleIt.isInstanceOf[Function1[Int, Int]]
defDoubleIt(6)

val explicitDoubleIt = new Function1[Int, Int] {
  def apply(n: Int): Int = n * 2
}
explicitDoubleIt(8)

val doIt = (n: Int, f: Int => Int) => f(n)

val squareIt = (n: Int) => n * n

doIt(100, doubleIt)
doIt(100, squareIt)
doIt(100, x => x +1)
doIt(100, _ + 1)


val quadrupleIt = doubleIt.andThen(defDoubleIt)
quadrupleIt(2)

