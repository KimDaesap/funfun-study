List(1,2,3) match {
  case h1 :: (tail @ h2 :: t) => println(h1, tail)
}