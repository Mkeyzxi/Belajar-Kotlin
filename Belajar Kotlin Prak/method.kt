class Student(var name: String, var nomorHp: String){

    fun sayHello(yourName: String): Unit = println("Hello ${yourName} anda adalah ${name}, nomor ${nomorHp}")
}

fun main() {
    var student1 = Student("Mahasiswa", "085342181132")
    student1.sayHello("Makbul")
    student1.name = "pekerja"
    println(student1.name)
}