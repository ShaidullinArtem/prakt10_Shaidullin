import org.jetbrains.annotations.Nullable

abstract class Q {
    abstract var cable: String
    abstract var type: String
    abstract var coreCount: Int
    abstract var d: Double
    abstract var Q: Double

    abstract fun getInfo()
}