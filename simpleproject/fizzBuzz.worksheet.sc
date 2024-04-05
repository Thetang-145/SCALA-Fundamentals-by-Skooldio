object Count {
    def fizzbuzzBasicIf(value: Int) = {
        if ((value % 3 == 0) && (value % 5 == 0)) "FizzBuzz"
        else if (value % 3 == 0) "Fizz"
        else if (value % 5 == 0) "Buzz"
        else value.toString()
    }
    def fizzBuzzPatternMatching(value: Int) = {
        val (fizz, buzz) = (value % 3 == 0, value % 5 == 0)
        (fizz, buzz) match
            case (true, true) => "FizzBuzz"
            case (true, false) => "Fizz"
            case (false, true) => "Buzz"
            case _ => value.toString()
    }
}

Count.fizzbuzzBasicIf(1)
Count.fizzBuzzPatternMatching(1)