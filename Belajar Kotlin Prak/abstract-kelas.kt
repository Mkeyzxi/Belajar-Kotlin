open class manusia() : nama(){
    override var manusia:String = "Manusia";
    override fun tampilUmur(){

    }
}

abstract class nama(){
    // tidak memiliki isi karena tidak dapat di deklarasikan
    abstract fun tampilUmur(){

    }
    abstract var manusia:String; 
}