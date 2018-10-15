// Ques 6  Print multiple of 3 upto 10 terms in at least three different ways using groovy special methods


// Using step method
3.step 31, 3, {
    println "Using step= ${(it)}"
}

println()

// Using upto method
1.upto(10, {
    println "Using upto= ${it*3}"
})

println()

// Using times method
10.times { it->
    println"Using times= ${(it +1)*3}"
}

