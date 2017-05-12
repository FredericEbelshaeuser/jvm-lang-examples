package de.yatta.assemble

fun main(args: Array<String>) {
	
	println(gaussify(0,0..100))
	
	//Null Safety
	var output:String ="Hi"
	//compiletime error
//	output=null
	
	var output2:String? ="Hi"
	output2=null	
}

fun gaussify(a: Int , b: IntRange):Int{
	var sum =a
	for(i in b)
		sum+=i
	
	println(sum)

	return sum
}