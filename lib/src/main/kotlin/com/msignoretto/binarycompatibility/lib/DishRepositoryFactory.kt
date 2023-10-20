package com.msignoretto.binarycompatibility.lib

public object DishRepositoryFactory {
    public fun create(): DishesRepository = DishesRepositoryImpl()
}