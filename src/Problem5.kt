fun main(args : Array<String>){
    var sword = Weapon("Greatsword", 10, 50.0, 100, 12.0)
    sword.getInfo()
}

open class Item(name : String, size : Int, weight : Double, requiredLevel : Int){
    var name : String
    var size : Int
    var weight : Double
    var requiredLevel : Int
    var requiredStrength : Int


    init {
        this.name = name
        this.size = size
        this.weight = weight
        this.requiredLevel = requiredLevel
        this.requiredStrength = (weight * size).toInt()
    }

    fun getInfo(){
        print("Item \"${this.name}\":\n" +
                "size: ${this.size}\n" +
                "weight: ${this.weight}\n" +
                "required level: ${this.requiredLevel}\n")
    }

}

class Weapon(name : String, size : Int, weight : Double, requiredLevel : Int, damage : Double) :
        Item(name, size, weight, requiredLevel){
    var damage : Double
    init {
        this.damage = damage
    }
}

class Armor(name : String, size : Int, weight : Double, requiredLevel : Int, efficienсy : Double) :
        Item(name, size, weight, requiredLevel){
    var efficienсy : Double
    init {
        this.efficienсy = efficienсy
    }
}

fun Array<String>.megaSplit(){
}