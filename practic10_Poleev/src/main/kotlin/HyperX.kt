class HyperX(override var name: String, override var frequency: Int, override var RAM: Double, private var HDD: Double):CompInterface {

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