


class Qp constructor(cable: String, type: String, coreCount: Int, d: Double, var isBraid: Boolean) : Q() {
    override var cable: String = cable
    override var type: String = type
    override var coreCount: Int = coreCount
    override var d: Double = d
    override var Q = d / coreCount.toDouble()

    override fun getInfo() {
        println(cable)
        println(type)
        println(coreCount)
        println(d)
        println(Q)
    }

    fun getQp(): Double {
        return if (isBraid) 2.0 * Q else 0.7 * Q;
    }
}