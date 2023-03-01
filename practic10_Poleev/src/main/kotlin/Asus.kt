class Asus(name: String, frequency: Int,RAM: Double, private var HDD:Double):Computer(name, frequency, RAM) {
    constructor(name: String,RAM: Double, HDD:Double):this(name, 10, RAM,HDD)

    override fun Q(): Double {
        return super.Q()+0.5*HDD
    }

    override fun info(): String {
        return "Название процессора - $name "+
                "Тактовая частота процессора - $frequency "+
                "Объем оперативной памяти - $RAM "+
                "Качество ${Q()} "
    }
}