interface Info {
    var name: String
    var frequency: Int
    var RAM: Int
    fun Q():Double{
        return 0.1*frequency+RAM
    }
    fun info():String
}