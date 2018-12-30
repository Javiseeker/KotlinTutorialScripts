enum class LootType{
    POTION, CRAFT, ARMOR
}

class Loot(val name: String, val type: LootType, val value: Double) {

    override fun toString(): String {
        return """
             name:  ${name.toUpperCase()}
             type: $type
             value: $value
             """
    }

}