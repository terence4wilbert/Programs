//: Playground - noun: a place where people can play

import UIKit

var str = "Hello, playground"


//let cubedV = map(nums, {(a:Int) -> Int in
//    return a*a })

// Closure

let cc1 = { print("Hello There") }

cc1()


let cc2 = { (a:String) -> String in
                return "Dear \(a)"}

let str1 = cc2("Omar")

// no parms and no return
let cc3 = { () -> () in
    var a = 20
    a+=1
    print("a = \(a)")
}

cc3()


let dummyNames = ["C", "B", "A"]

let sortA = {(a:String, b:String) -> Bool in
    return a < b}

//let sortANames = sorted(dummyNames, sortA)
