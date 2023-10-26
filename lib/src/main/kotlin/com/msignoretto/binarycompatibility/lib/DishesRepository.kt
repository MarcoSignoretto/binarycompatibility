package com.msignoretto.binarycompatibility.lib

public interface DishesRepository {
    public fun getDishes(specification: DishSpecification = DishSpecifications.all()): List<Dish>
}