class Weapon(var name: String, var damageInflicted: Double) {

    override fun toString(): String {
        return """
             name:  $name
             damage Inflicted: $damageInflicted
             """
    }
}