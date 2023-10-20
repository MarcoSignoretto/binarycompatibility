package com.msignoretto.binarycompatibility.moduleB

import com.msignoretto.binarycompatibility.lib.DishRepositoryFactory

class ModuleBBinary {
    fun run() {
        val dishesRepository = DishRepositoryFactory.create()
        dishesRepository.getDishes().forEach {
            println("${it.name} - ${it.description} - ${it.price}")
        }
    }
}