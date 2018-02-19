package main

import "fmt"

func main() {
	m := make(map[string]int)
	fmt.Println(m)
	m["k1"] = 7
	m["k2"] = 13

	fmt.Println()
	fmt.Println("Map: ", m)
	fmt.Println("m[k2]", m["k2"])

	v1 := m["k1"]
	fmt.Println("v1: ", v1)

	fmt.Println("len: ", len(m))
	fmt.Println("Map Before:", m)
	delete(m, "k2")
	fmt.Println("Map After:", m)

	_, prs := m["k2"]
	fmt.Println("prs:", prs)
	// fmt.Println(" _ :", _)

}