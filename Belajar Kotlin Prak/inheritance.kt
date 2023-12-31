open class Empoyee(val name: String){
    fun sayHello(name: String){
        println("Hello $name, My Name is ${this.name}")
    }
}

class Manager(name: String) : Empoyee(name)

class VicePresident(name: String) : Empoyee(name) {
}


fun main(){
    var parent = Empoyee("mkeyzxi")
    parent.sayHello("Rexikuaslai")

    var child = Manager("indonesia")
    child.sayHello("ERkaj")

    var child2 = VicePresident("mbul")
    child2.sayHello("Marhaban")

    
}