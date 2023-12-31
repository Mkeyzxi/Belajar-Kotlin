open class Empoyee(val name: String){
    open fun sayHello(name: String){
        println("Hello $name, My Name is ${this.name}")
    }
}

class Programmer(name: String) : Empoyee(name)

open class Manager(name: String) : Empoyee(name){
    final override fun sayHello(name: String){
        println("Hello ${this.name}, My Name is $name i'm managar this is true ;) ")
    }
}
class SuperManager(name: String) : Manager(name){
    // ERROR DIKARENAKAL MANAGER FUN SAY HELLO FINAL, JIKA MAU TIDAK HAPUS KATA FINAL.
    // override fun sayHello(name: String){
    //     println("Hello ${this.name}, My Name is $name i'm managar this is true ;) ")
    // }
}

class VicePresident(name: String) : Empoyee(name) {
    override fun sayHello(name: String){
        println("Hello $name, My Name is ${this.name} i'm vice president '_' ")
    }
}




fun main(){
    var parent = Empoyee("mkeyzxi")
    parent.sayHello("Rexikuaslai")

    var child = Programmer("mbul ganteng")
    child.sayHello("Makbul N")

    var child1 = Manager("indonesia")
    child1.sayHello("ERkaj")

    var child2 = VicePresident("Ma'ruf Amin")
    child2.sayHello("mbul")

    var child3 = Programmer("mbul ganteng")
    child3.sayHello("Makbul N")

    
}