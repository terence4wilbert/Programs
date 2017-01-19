//
//  arrays.swift
//  
//
//  Created by Terence Wilbert on 12/22/16.
//
//

import Foundation

func array_test() {
    var ar: [Int] = [1,3,5,7,9,11,13,15]

    print(ar)
    
    let lastPop: Int = ar.popLast()!
    print(lastPop)
    ar.append(6)
    ar.append(2)
    ar.append(4)
    
    print(ar)
    print("Index of 5: \(ar.index(of:5)!)")
    
    ar.remove(at:2)
    print(ar)
    
    let reverseBack: [Int] = ar.reversed()

    
    print("Reversed the array using constant: \(reverseBack)")
    print("Reversed sorted return: \(ar.sorted())")
    print("Printing original array: \(ar)")
    
    ar.sort()
    print("Sorted in place \(ar)")
    
    ar.append(12)
    print("I have appened 12: \(ar)")
    
    print("The size of the array: \(ar.count)")
}


print(array_test())
