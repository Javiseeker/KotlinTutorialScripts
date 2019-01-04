class Player(val name: String,var lives: Int =3, var level: Int = 1, var score: Int = 0) {
    var weapon: Weapon = Weapon("Fists",1.0) // patron de diseño, Decorator. Solid Principles.
    //val recyclerViewAdapter: RecycleViewAdapter
    private val inventory = ArrayList<Loot>()

    fun show() {
        if(lives >0){
            println("$name is alive")
        } else {
            println("$name is dead")
        }
    }

    override fun toString(): String {
        return """
             name:  ${name.toUpperCase()}
             lives: $lives
             level: $level
             score: $score
             Player's weapon: $weapon
             """
    }
    fun getLoot(item: Loot){
        inventory.add(item)
        // code to save the inventory
    }
    fun dropLoot(item: Loot): Boolean{
        return if(inventory.contains(item)){
            inventory.remove(item)
            true
        } else {
            false
        }

    }
//    fun dropLoot(name: String): Boolean {
//        for(each in inventory){
//            if (each.name == name){
//                inventory.remove(each)
//                return true
//            }
//        }
//        return false
//    }
    fun dropLoot(name : String): Boolean {
    var result = false
    for (item in inventory){
        if (item.name == name) {
            inventory.remove(item)
            result = true
            break
        }
    }
    return result
}
    fun showInventory(){
        var total = 0.0
        println("$name's Inventory")
        for (item in inventory){
            println(item)
            total += item.value
        }
        println("================================")
        println("Total score is: $total")
        println("================================")
    }
}