abstract class Computer(var name: String, var frequency: Int, var RAM: Double){
    constructor(name:String,frequency: Int):this(name,frequency,0.0)
    open fun Q():Double{
        return 0.1*frequency+RAM
    }
    open fun info():String{
        return "Название процессора - $name "+
                "Тактовая частота процессора - $frequency МГц"+
                "Объем оперативной памяти - $RAM Мб"+
                "Качество ${Q()} Гб"
    }
}