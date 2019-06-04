fun main(args : Array<String>){
    var hero = Hero(5, 0)
    var temp : Int
    while (true){
        print("Exp to add: ")
        temp = readLine()!!.toInt()
        hero.add_exp(temp)
    }

}

class Hero(private var strength : Int, private var lvl : Int) : Unit{
    val DEFAULT_HP = 100
    val MAX_EXP = 50
    val EXP_COEF = 0.1
    val DEFAULT_INVENTORY_SIZE = 10

    private var hp : Int
    private var exp : Int
    public var inventory : ArrayList<Item>
    public var inventory_size : Int
    public var max_inventory_size : Int
    public var requaired_exp : Int

    init {
        this.hp = DEFAULT_HP + attributeBonus()
        this.exp = 0
        this.inventory = ArrayList()
        this.inventory_size = DEFAULT_INVENTORY_SIZE
        this.max_inventory_size = DEFAULT_INVENTORY_SIZE
        this.requaired_exp = MAX_EXP
    }

    fun attributeBonus() : Int{
        return strength * lvl
    }

    fun add_exp(exp_to_add : Int) {
        this.exp += exp_to_add
        while (this.exp >= this.requaired_exp) {
            update()
        }
        println("Added $exp_to_add exp. Current exp is ${this.exp}/${this.requaired_exp}")
    }

    fun update(){
        if (this.exp >= this.requaired_exp){
            this.exp -= requaired_exp;
            this.lvl++
            this.requaired_exp += (EXP_COEF * this.requaired_exp).toInt()
            println("Levelup! New lvl is ${this.lvl}.\n")
        }
        this.hp = DEFAULT_HP + attributeBonus()
    }

    fun storeThing(thing : Item) {
        if (inventory_size + 1 < this.max_inventory_size)
            inventory.add(thing)
    }

    fun DropThing(thing: Item) {
        this.inventory.remove(thing)
    }

    override fun draw(){
        println("Hero was drawn.")
    }
}


interface Unit{
    fun draw()
}