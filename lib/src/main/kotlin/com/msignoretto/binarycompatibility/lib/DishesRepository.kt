package com.msignoretto.binarycompatibility.lib

public interface DishesRepository {
    public fun getDishes(): List<Dish>
    public fun getDishes(specification: DishSpecification): List<Dish>
}