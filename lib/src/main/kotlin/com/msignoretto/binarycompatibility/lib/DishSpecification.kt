package com.msignoretto.binarycompatibility.lib

public interface DishSpecification

public object DishSpecifications {
    public fun all(): DishSpecification = DishSpecificationImpl.All
    public fun vegan(): DishSpecification = DishSpecificationImpl.Vegan
    public fun vegetarian(): DishSpecification = DishSpecificationImpl.Vegetarian
}

private sealed class DishSpecificationImpl : DishSpecification {
    data object Vegan : DishSpecificationImpl()
    data object Vegetarian : DishSpecificationImpl()
    data object All : DishSpecificationImpl()
}