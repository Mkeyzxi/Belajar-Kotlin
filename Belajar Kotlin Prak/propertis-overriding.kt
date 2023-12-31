open class Shape{
    open val corner: Int = -1
}

open class S : Shape(){
    override val corner: Int = 4
}
class H : S(){
    override val corner: Int = 7
}

fun main(){
    val shape = Shape()
    val s = S()
    val h = H()
    println(shape.corner)
    println(s.corner)
    println(h.corner)

}