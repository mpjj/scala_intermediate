case class Cash(pounds: Int, pence: Int)

val in = Cash(100, 0)

val out = Cash(150,50)

val c1 = Cash(99, 22)
c1.pounds
c1.pence

val c2 = c1.copy()

c1.equals(c2)

val c3 = c1.copy(pence = 50)

c1.equals(c3)