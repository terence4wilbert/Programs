package main

import "fmt"

func main() {

	i := 1
	for i <= 3 {
		fmt.Println(i)
		i = i + 1
	}
	fmt.Println("\n")
	for j:= 7; j <= 9; j++ {
		fmt.Println(j)
	}
	fmt.Println("\n")
	for {
		fmt.Println("loop")
		break
	}
	fmt.Println("\n")
	for n := 0; n <= 5; n++ {
		if n % 2 == 0 {
			continue
		}
		fmt.Println(n)
	}
}
