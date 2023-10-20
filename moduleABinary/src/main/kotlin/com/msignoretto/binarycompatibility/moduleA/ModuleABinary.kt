package com.msignoretto.binarycompatibility.moduleA

import com.msignoretto.binarycompatibility.lib.DishRepositoryFactory

class ModuleABinary {
    fun run() {
        val dishesRepository = DishRepositoryFactory.create()
        dishesRepository.getDishes().forEach {
            println("${it.name} - ${it.description} - ${it.price}")
        }
    }
}