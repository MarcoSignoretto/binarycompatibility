package com.msignoretto.binarycompatibility.lib

internal class DishesRepositoryImpl : DishesRepository {

    private val dishes = listOf(
        Dish(
            name = "Pizza",
            description = "Pizza with tomato and cheese",
            price = 10.0
        ),
        Dish(
            name = "Pasta",
            description = "Pasta with tomato and cheese",
            price = 8.0
        ),
    )

    override fun getDishes(specification: DishSpecification): List<Dish> {
        return dishes
    }


    override fun getDishes(): List<Dish> {
        return emptyList()
    }
}