fun main(args: Array<String>) {
    LaptopFactory.register("MacBook"){ComputerMacBook()}
    val computeMacBook= LaptopFactory.create("MacBook")
    computeMacBook?.OperatingSystem()
}
class ComputerMacBook:Computer{
    override fun OperatingSystem() {
        println("OperatingSystem macOS")
    }
}
class ComputerDell:Computer{
    override fun OperatingSystem() {
        println("OperatingSystem Windows")
    }
}
interface Computer{
    fun OperatingSystem()
}
object LaptopFactory{
    private val registry = mutableMapOf<String, () -> Computer>()
    fun register(type: String, creator: () -> Computer) {
        registry[type] = creator
    }
    fun create(type: String): Computer? {
        return registry[type]?.invoke()
    }
}