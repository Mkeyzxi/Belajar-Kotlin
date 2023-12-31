

class Person(paramBrand: String, paramName:String?, paramYear: Int){
    init {
        println("constructor utama")
    }

    constructor(paramBrand: String, paramYear: Int) : this(paramBrand, null, paramYear){
        println("constructor secondary 1")
    }
    constructor(paramBrand: String) : this(paramBrand,0){
        println("constructor secondary 2")
    }
    var paramBrand: String = paramBrand;
    var paramYear: Int = paramYear;
    var paramName: String? = paramName;

}
fun main(){
    var person1 = Person("mbul","ganteng",2022)
    var person2 = Person("mbul",2022)
    var person3 = Person("mbul")   
    

    // println(person1.paramBrand)
    // println(person1.paramYear)
    // println("${person1.paramName}")
}


// Pilihan kedua
// class Person(paramBrand: String, paramName: String?, paramYear: String) {
//     init{
//         println("constructor utaama")
//     }
//     constructor(paramBrand: String, paramYear: String) : this(paramBrand, null, paramYear) {
//         println("constructor secondary 1")
//     }
//     constructor(paramBrand: String) : this(paramBrand,""){
//         println("constructor secondari 2")
//     }

//     var brand: String = paramBrand
//     var year: String = paramYear
//     var name: String? = paramName
// }

// fun main() {
//     var person1 = Person("mbul","2022","12")
//     var person2 = Person("mbul","2022")
//     var person3 = Person("mbul")

// }
