package com.msignoretto.binarycompatibility.app

import com.msignoretto.binarycompatibility.moduleA.ModuleA
import com.msignoretto.binarycompatibility.moduleA.ModuleABinary
import com.msignoretto.binarycompatibility.moduleB.ModuleB
import com.msignoretto.binarycompatibility.moduleB.ModuleBBinary

fun main() {
    println(">> Module A <<")

    val moduleA = ModuleA()
    moduleA.run()

    println(">> Module B <<")

    val moduleB = ModuleB()
    moduleB.run()

    println(">> Module A Binary <<")

    val moduleABinary = ModuleABinary()
    moduleABinary.run()

    println(">> Module B Binary <<")

    val moduleBBinary = ModuleBBinary()
    moduleBBinary.run()
}