package test.task3


data class Recipes(
    var name: String, var isFavorite: Boolean, val spices: List<String>, val ingredients: HashMap<String, Int>
)


fun main() {
    val recipesList = listOf(
        Recipes(
            "Paneer Bhurji", true,
            listOf("Salt", "cumin seeds", "red chilli powder", "cumin seed powder"),
            hashMapOf("bay leaves" to 2, "green cardamoms" to 5, "cloves" to 5, "onion" to 1, "ginger" to 2)
        ), Recipes(
            "Paneer Malpua", false,
            listOf("saffron", "khoya", "red chilli powder", "cumin seed powder"),
            hashMapOf("milk" to 8, "maida" to 2, "sugar" to 1, "dry fruits" to 1)
        ), Recipes(
            "Multani Paneer Tikka", true,
            listOf("zeera", "garam masala", "pepper powder", "cornflour"),
            hashMapOf("cottage cheese" to 1, "white mushroom" to 2, "ginger" to 1, "coriander leaves" to 3)
        ), Recipes(
            "Paneer Butter Masala", false, listOf(
                "Salt", "Black cardamom", "Red chilli powder", "Coriander powder", "Cumin powder", "Garam masala"
            ), hashMapOf("Honey" to 1, "Milk" to 3, "Kasoori methi" to 1, "Tomato" to 6)
        ), Recipes(
            "Paneer Angara", false, listOf(
                "Salt", "Black cardamom", "Red chilli powder", "Coriander powder", "Cumin powder", "Garam masala"
            ), hashMapOf("Honey" to 1, "Milk" to 3)
        ), Recipes(
            "Paneer", true, listOf(
                "Black cardamom", "Red chilli powder", "Coriander powder", "Cumin powder", "Garam masala"
            ), hashMapOf("Honey" to 1, "Milk" to 3)
        )
    )


    //   i) Identify recipes that have more than 3 ingredients.
    println("Identify recipes that have more than 3 ingredients")
    recipesList.filter {
        it.ingredients.size > 3
    }.forEach { recipe ->
        printRecipe(recipe)

    }
    println()


//    ii) Identify recipes with at least one ingredient that has a quantity greater than 5.

    println("Identify recipes with at least one ingredient that has a quantity greater than 5")
    recipesList.filter {
        it.ingredients.filter { ingredient ->
            ingredient.value > 5
        }.isNotEmpty()
    }.forEach { recipe ->
        printRecipe(recipe)

    }
    println()

//    iii) Identify recipes that are marked as favorites.
    println("Identify recipes that are marked as favorites")
    recipesList.filter {
        it.isFavorite
    }.forEach { recipe ->
        printRecipe(recipe)

    }

//Replace the names of recipes with more than one word by enclosing each word in the name with
// "$" symbols using the collection's  method. For example, "Paneer Kadai" becomes "$Paneer$ $Kadai$".
    println("enclosing each word in the name with $ ")

    recipesList.map {
        val words = it.name.split(" ")
        var name = it.name
        if (words.size > 1) {
            name = ""
            words.forEach {
                name += "$${it}$ "
            }
        }
        Recipes(name, it.isFavorite, it.spices, it.ingredients)
    }.forEach { recipe ->
        printRecipe(recipe)

    }


    //extra 1
    println("Print recipe which use honey")
    recipesList.filter {
        it.ingredients.filter {
            it.key == "Honey"
        }.isNotEmpty()

    }.forEach { recipe ->
        printRecipe(recipe)

    }

    //extra 2
    println("Print recipe which is favourite but contains ginger")
    recipesList.filter {
        it.isFavorite
    }.filter {
        it.ingredients.containsKey("ginger")
    }.forEach { recipe ->
        printRecipe(recipe)
    }


}

fun printRecipe(recipes: Recipes) {
    println("---------------------------------------------------------")
    println("Recipe Name : ${recipes.name}")
    println("Is Recipe Favourite : ${recipes.isFavorite}")
    println("Spices : ${recipes.spices}")
    println("Ingrediants : ${recipes.ingredients}")
    println("---------------------------------------------------------")
}