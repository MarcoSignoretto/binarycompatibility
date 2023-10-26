package com.msignoretto.binarycompatibility.app

import com.msignoretto.binarycompatibility.moduleA.ModuleA
import com.msignoretto.binarycompatibility.moduleB.ModuleB

fun main() {
    println(">> Module A <<")

    val moduleA = ModuleA()
    moduleA.run()

    println(">> Module B <<")

    val moduleB = ModuleB()
    moduleB.run()
}