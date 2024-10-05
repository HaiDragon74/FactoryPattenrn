fun main(args: Array<String>) {
    val engine = Engine()
    val car = Car(engine)
    car.start()
}
class Car(private val engine: Engine) {
    fun start() {
        engine.start()
    }
}
class Engine(){
    fun start() {
        println("Engine is running")
    }
}

