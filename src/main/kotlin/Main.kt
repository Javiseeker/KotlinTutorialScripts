fun main(args: Array<String>) {
    val conan = Player("Conan")
    conan.getLoot(Loot("Invisibility", LootType.POTION, 4.0))
    conan.getLoot(Loot("Mithril", LootType.ARMOR, 183.0))
    conan.getLoot(Loot("Ring of Speed", LootType.CRAFT, 25.0))
    conan.getLoot(Loot("Red Potion", LootType.POTION, 2.0))
    //conan.getLoot(Loot("Cursed Shield", LootType.ARMOR,-8.0))
    conan.getLoot(Loot("Brass Ring", LootType.CRAFT, 1.0))
    conan.getLoot(Loot("Chain Mail", LootType.ARMOR, 4.0))
    conan.getLoot(Loot("Gold Ring", LootType.CRAFT, 12.0))
    conan.getLoot(Loot("Gold Ring", LootType.CRAFT, 12.0))
    conan.getLoot(Loot("Gold Ring", LootType.CRAFT, 12.0))
    conan.getLoot(Loot("Health Potion", LootType.POTION, 3.0))
    conan.getLoot(Loot("Silver Ring", LootType.CRAFT, 6.0))
    conan.getLoot(Loot("Silver Ring", LootType.CRAFT, 6.0))
    conan.showInventory()

    conan.dropLoot("Gold Ring")
    conan.dropLoot("Silver Ring")
    conan.showInventory()
    val dropped = conan.dropLoot("Something not present")
    println(dropped)
    println(conan.dropLoot("Something else"))
    if (conan.dropLoot("a bit of junk")){
        println("junk dropped")
    } else {
        println("you don't have any junk")
    }
}