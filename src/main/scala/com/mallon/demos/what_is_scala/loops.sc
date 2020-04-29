var i = 1

while( i <= 5){
  if( i % 2 == 0)
    println(i + ": even")
  else
    println(i + ": odd")
  i += 1
}
var j = 1
var total = 0
while(j <= 5){
  total += j
  j += 1
}

total

//compiler will translate this for loop into a call of
//foreach on the input
for(a <- 1 to 5) println(a)

//all sequences are subtypes of the
//Traversable type which defines foreach()
1 to 5 foreach(println(_))