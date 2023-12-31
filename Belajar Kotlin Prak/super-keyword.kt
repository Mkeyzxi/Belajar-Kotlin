open class Shape{
    open val corner: Int = -1 // corner parent
    open fun setName(){
        println("nama saya mbul")
    }
}

open class S : Shape(){
    val parentCorner: Int = super.corner
    override val corner: Int = super.corner // child-1 mengambil properties parent
    override fun setName(){
        println("nama saya mkeyzxi")
        super.setName()
        
    }
}
open class H : S(){
    override val corner: Int = 4 // child-2 mengambil properties child-1
}
class A : H(){
    override val corner: Int = super.corner // child-3 mengambil properties child-2
}
fun main(){
    val shape = Shape()
    val s = S()
    val h = H()
    val a = A()
    println(shape.corner)
    println(s.corner)
    println(s.parentCorner)
    println(h.corner)
    println(a.corner)
    println(s.setName())


}