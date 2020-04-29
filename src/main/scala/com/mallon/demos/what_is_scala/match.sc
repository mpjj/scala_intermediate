val month = 5

month match{
  case 1 => println("Jan")
  case 2 => println("Feb")
  case 3 => println("March")
  case 4 => println("April")
  case 5 => println("May")
  case 12 => println("December")
  case _ => println("Oooops")
}

def season (month: Int) = month match{
  case 1 | 2 | 3 => "Winter"
  case 4 | 5 | 6 => "Spring"
  case 7 | 8 | 9 => "Summer"
  case 10 | 11 | 12 => "Autumn"
  case _ => "Weird"
}

season(2)

def state (temp: Int)={
  temp match {
    case i if (i < 0) => "ice"
    case i if (i >= 0 && i < 100) => "water"
    case i if (i >= 100) => "steam"
  }
}

state(120)
state(-10)