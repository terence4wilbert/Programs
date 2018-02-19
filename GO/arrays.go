package main

import "fmt"

func main() {
	var a [5] int
	fmt.Println("emp:", a)


	a[4] = 100
	fmt.Println("set:", a)
	fmt.Println("get:", a[4])

	fmt.Println("len:", len(a))

	b :=[5]int{1,2,3,4,5}
	fmt.Println("dcl:", b)

	var twoD [2][3]int
	for i:=0; i<2; i++ {
		for j :=0; j < 3; j ++ {
			twoD[i][j] = i + j
		}
	}
	fmt.Println("2d: ", twoD)



	var x [5]float64
	x[0] = 98
	x[1] = 93
	x[2] = 77
	x[3] = 82
	x[4] = 83

	var total float64 = 0
	for _, value := range x{
		total += value
	}
	fmt.Println(total / float64(len(x)))
}