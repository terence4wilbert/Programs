package main
import (
	"fmt"
	//"os"
)

func main(){
	//var s, sep string
	//
	//for i := 1; i < len(os.Args); i++ {
	//	s += sep + os.Args[i]
	//	sep = " "
	//}
	//fmt.Println(s)

	var x [5]int
	x[4] = 100
	fmt.Println(x)
	fmt.Println('\n')
	fmt.Println(x[3])
}