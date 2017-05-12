package de.yatta.assemble.groovy

	println gaussifyG(0, 0..100)
	println gaussifyG("", "A".."Z")
	println "\n"
	
	def gaussifyG(a,r){
		//will crash because of char range
		//		int sum=a
		def sum=a
		for(i in r){
			sum+=i
		}
		sum
	}
	

	
	println gaussifyMoreGroovyLike(0, 0..100)
	println gaussifyMoreGroovyLike("", "A".."Z")
	
	def gaussifyMoreGroovyLike(a,r){
		
		r.inject(a, {sum,i-> sum+i})
	
	}
	

