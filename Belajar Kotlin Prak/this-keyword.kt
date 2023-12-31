class Akun{
    var username: String = "";

    fun Login(username: String, password: String){
        println("usernameku $username dan password $password, nama saya ${this.username}");
    }
}

fun main(){
    var akun1 = Akun()
    akun1.username = "mkeyzxi";
    akun1.Login("Muhammad Makbul N","Mbul Ganteng");
    akun1.username = "Jam Tangan Macbeth"
    akun1.Login("Rexa Marjadilon","1209128192");
}