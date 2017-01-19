//: Playground - noun: a place where people can play

import UIKit

var str = "Hello, playground"
print("Intro Playground, Learning Swift 3")
print("Hello World")
print(str)
var myVariable = 42
myVariable = 50
let myConstant = 42

let implicitInteger = 70
let implicitDouble = 70.0
let explicitDouble: Double = 70

//Experiment
let explicitFloat: Float = 4

let label = "The width is "
let width = 94
let widthLabel = label + String(width)

//Experiment
//let widthLabel = label + width

let apples = 3
let oranges = 5
let appleSummary = "I have \(apples) apples."
let fruitSummary = "I have \(apples + oranges) pieces of fruit."
let myName = "Terence"
let greetSummary = "Good Evening Sir \(myName)"
let floatSummary = "We have a float of \(explicitFloat * 4.3)"


//Arrays
var shoppingList = ["catfish", "water", "tulips", "blue paint"]
shoppingList[1] = "bottle of water"
shoppingList

//Dictionary
var occupations = [
    "Malcom": "Captain",
    "Kaylee": "Mechanic",
]
occupations["Jayne"] = "Public Relations"
occupations
//Create empty array
let emptyArray = [String]()
shoppingList = []

//Create empty dictionary
let emptyDictionary = [String: Float]()
occupations = [:]

let individualScores = [75, 43, 103, 87, 12]
var teamScore = 0
for score in individualScores {
    if score > 50 {
        teamScore+=3
    } else {
        teamScore+=1
    }
}
print(teamScore)

var optionalString: String? = "Hello"
print(optionalString == nil)

var optionalName: String? = "John Appleseed"
var greeting = "Hello!"
if let name = optionalName{
    greeting = "Hello, \(name)"
}

let nickName: String? = nil
let fullName: String = "John Appleseed"
let informalGreeeting = "Hi \(nickName ?? fullName)"

//switch statement
let vegetable = "red pepper"
switch vegetable {
    case "celery":
        print("Add some raisins and make ants on a log.")
    case "cucumber", "watercress":
        print("That would make a good tea sandwich.")
    case let x where x.hasSuffix("pepper"):
        print("Is it a spicy \(x)?")
    default:
        print("Everythiing tastes good in soup.")
    
}

let interestingNumbers = [
    "Prime": [2, 3, 5, 7, 11, 13],
    "Fibonacci": [1, 1, 2, 3, 5, 8],
    "Square": [1, 4, 9, 16, 25],
]
var largest = 0
var whatKind = ""
for (kind, numbers) in interestingNumbers {
    for number in numbers {
        if number > largest {
            largest = number
            whatKind = kind
        }
    }
}
print(largest)
print("The largest number is a \(whatKind) and the largest number is \(largest)")


//while loop

var n = 2
while n < 100 {
    n = n * 2
}
print(n)

var m = 2
repeat{
    m = m  * 2
}while m < 100
print(m)


var total = 0
for i in 0..<4 {
    total += 1
}
print(total)


//Functions

func greet(person: String, day: String) -> String {
    return "Hello \(person), today is \(day)."
}

greet(person: "Bob", day: "Tuesday")

func greet(_ person: String, on day: String)-> String {
    return "Hello \(person), today is \(day)."
}
greet("John", on: "Wednesday")


func calculateStatistics(scores: [Int]) -> (min: Int,max: Int, sum: Int) {
    var min = scores[0]
    var max = scores[0]
    var sum = 0
    
    for score in scores {
        if score > max {
            max = score
        } else if score < min {
            min = score
        }
        sum += score
    }
    return(min, max, sum)
}
let statistics = calculateStatistics(scores: [5, 3, 100, 3, 9])
print(statistics.sum)
print(statistics.2)

func sumOf(numbers: Int...)-> Int {
    var sum = 0
    for number in numbers {
        sum += number
    }
    return sum
}
sumOf()
sumOf(numbers: 42, 597, 12)

func averageOf(numbers:Int...)-> Int {
    var ave = 0
    var sum = 0
    var total = 0
    for number in numbers {
        sum += number
        ave += 1
    }
    total = sum / ave
    return total
}
averageOf(numbers: 12, 25, 33, 18)


//Nested Function
func returnFifteen() -> Int {
    var y = 10
    func add() {
        y+=5
    }
    add()
    return y
}
returnFifteen()

// First class type function (can return another function as its value)
func makeIncrementer()->((Int) -> Int) {
    func addOne(number: Int) -> Int {
        return 1 + number
    }
    return addOne
}
var increment = makeIncrementer()
increment(7)


// Taking another function as argument
func hasAnyMatches(list: [Int], condition:(Int)->Bool)->Bool {
    for item in list {
        if condition(item) {
            return true
        }
    }
    return false
}
func lessThanTen(number: Int) -> Bool {
    return number < 10
}
var numbers = [20,19, 7, 12]
hasAnyMatches(list: numbers, condition: lessThanTen)


numbers.map({
    (number: Int) -> Int in
    let result = 3 * number
    return result
})


// Experiement 
numbers.map({
    (number: Int) -> Int in
    var result = 0
    if number % 2 == 1{
        result = 0
    }
    return result
})

// Single Closures
let mappedNumbers = numbers.map({ number in 3 * number })
print(mappedNumbers)

let sortedNumbers = numbers.sorted { $0 > $1 }
print(sortedNumbers)


// Closure practice
func square(a: Float) -> Float {
    return a*a
}

func cube(a: Float) -> Float {
    return a * a * a
}

func averageSumOfSquares(a: Float, b: Float) -> Float {
    return (square(a: a) + square(a: b))/2.0
}

func averageSumOfCubes(a: Float, b: Float) -> Float {
    return (cube(a: a) + cube(a: b))/3.0
}

//closure as a parameter
func averageOfFunction(a: Float, b: Float, f:((Float) -> Float)) -> Float {
    return(f(a)+f(b))/2
}

averageOfFunction(a: 3, b: 4, f: square)
averageOfFunction(a: 3, b: 4, f: cube)

//inline closure with no name
averageOfFunction(a:3, b: 4, f: {(x: Float) -> Float in return x * x})
/*
 (x: Float) -> Float is the type of closure( function that recieves a float an returns a value 'return x * x'
 */

//omit type decleration
averageOfFunction(a: 3, b: 4, f:{x in return x * x})


//Closure omitting the return statement
averageOfFunction(a: 3, b: 4, f: { x in x * x})

//Closure with default param names $0, $1,....$K
averageOfFunction(a:3, b:4, f: {$0 * $0})

// map method
//[x1, x2, ... , xn].map(f) -> [f(x1), f(x2), ... , f(xn)]
//Ugly way
//I.E. [10, 20, 45, 32] -> ["10E", "20E", "45E", "32E"]
var moneyArray = [10,20,45,32]
//var stringsArray:[String] = []
//for money in moneyArray {
//    stringsArray += "\(money)$"
//}

//Objects and Classes 

class Shape {
    var numberOfSides = 0
    let input = 3
    func simpleDescription() -> String {
        return "A shape with \(numberOfSides) sides"
    }
    
    func takeArgs(on: Int) -> Int {
        return (on + 1)
    }
}

var shape = Shape()
shape.numberOfSides = 7
print(shape.input)
var shapeDescription = shape.simpleDescription()
var amountIn = shape.takeArgs(on: 4)


class NamedShape {
    var numberOfSides: Int = 0
    var name: String
    
    init(name: String) {
        self.name = name
    }
    
    func simpleDescription() -> String {
        return "A shape with \(numberOfSides) sides."
    }
}

