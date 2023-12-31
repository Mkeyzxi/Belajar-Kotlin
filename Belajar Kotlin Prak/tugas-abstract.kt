
abstract class Hewan{
    abstract var jenisHewan: String;
    abstract var warna: String;
    abstract var tingkahLaku: String;
    abstract fun jenisHewan();  
}

class Kucing : Hewan(){
    override var jenisHewan: String = "Kucing";
    override var warna: String = "putih";
    override var tingkahLaku: String = "menggemaskan";
    override fun jenisHewan(){
        println("hewan ini tidak berbahaya");
        println("jenis \t\t : ${jenisHewan}")
        println("warna \t\t : ${warna}")
        println("tingkah laku : ${tingkahLaku}")
    }
}
class Buaya : Hewan(){
    override var jenisHewan: String = "Buaya";
    override var warna: String = "Hijau";
    override var tingkahLaku: String = "menerkam";
    override fun jenisHewan(){
        println("\nhewan ini berbahaya");
        println("jenis \t\t : ${jenisHewan}")
        println("warna \t\t : ${warna}")
        println("tingkah laku : ${tingkahLaku}")
    }
}
fun main(){
    var kucing = Kucing();
    kucing.jenisHewan();
    var buaya = Buaya();
    buaya.jenisHewan();
    buaya.jenisHewan = "Teman";
    buaya.warna = "Cokelat";
    buaya.tingkahLaku = "Anjing";
    buaya.jenisHewan();
}
