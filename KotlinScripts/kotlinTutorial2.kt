fun main(args: Array<String>) {
    val javi = Player("Javi")
    val louise = Player("Louise",level=5)
    val meme = Player("Jaime",8,4)
    val echo = Player("Echo",5,2,1000)

    meme.weapon.name = "battleaxe"
    meme.weapon.damageInflicted = 32.32
    javi.weapon =Weapon("sword",40.52)
    louise.weapon = javi.weapon
    javi.weapon = Weapon("spear",25.0)
    //println("echo's weapon is ${echo.weapon.name} and its damage value is ${echo.weapon.damageInflicted}")
    //println(meme.weapon.name.toUpperCase())
    //println(meme.weapon.damageInflicted)
    //meme.show()
    //javi.show()
    //louise.show()
    val redPotion = Loot("Red Potion", LootType.POTION, 7.50)
    javi.getLoot(redPotion)
    val chestArmor = Loot("+3 Chest Armor", LootType.ARMOR, 80.00)
    javi.getLoot(chestArmor)
    javi.getLoot((Loot ("Ring of Destruction +2",LootType.CRAFT, 40.32)))
    javi.getLoot((Loot("Mana Potion",LootType.POTION, 32.32) ))
    javi.getLoot((Loot("ebony earrings +9", LootType.CRAFT, 3323.31)))

    meme.getLoot(Loot("full moon sword +9", LootType.ARMOR, 9000.00))
    javi.showInventory()
    meme.showInventory()

    if(javi.dropLoot(redPotion)){
        javi.showInventory()
    } else {
        println("you don't have a ${redPotion.name}")
    }
    val bluePotion =Loot("Blue Potion", LootType.POTION,6.00)
    if (javi.dropLoot(bluePotion)){
        javi.showInventory()
    } else{
        println("you don't have a ${bluePotion.name}")
    }

    if (javi.dropLoot("Ring of Destruction +2")){
        javi.showInventory()
    } else{
        println("you don't have a ring of destruction +2")
    }




    //for loops cases
//    for (i in 0 until 10){
//        println("$i squared is ${i*i}")
//    }
//    println("===============")
//    for (i in 0 .. 10){
//        println("$i squared is ${i*i}")
//    }
//    println("=================")
//    for (i in 0 .. 9){
//        println("$i squared is ${i*i}")
//    }
//    for (i in -10 downTo -12 step 2){
//        println("$i")
//    }
//    for(i in 0..101){
//        if(moduleOf3and5(i)){
//            println("$i")
//        }
//    }
//println("Teacher Results: ")
//    for(value in 3..100 step 3){
//        if (value %5 ==0){
//            println("$value")
//        }
//    }
}
//fun moduleOf3and5(a: Int): Boolean{
//    return a%3==0 && a%5==0
//}
