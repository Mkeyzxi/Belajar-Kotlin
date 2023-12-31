class Mbul(nama:String = "nama", tinggi:Int = 175, berat:Int = 50){
    var nama:String = nama;
    var tinggi:Int = tinggi;
    var berat:Int = berat;
}


fun main() {
    var orang1 = Mbul("mbul", 170, 52);
    var orang2 = Mbul("rezkzq", 166, 48);
    var orang3 = Mbul();
    println("nama ${orang1.nama} | tinggi ${orang1.tinggi} | berat ${orang1.berat}")
    println("nama ${orang2.nama} | tinggi ${orang2.tinggi} | berat ${orang2.berat}")
    println("nama ${orang3.nama} | tinggi ${orang3.tinggi} | berat ${orang3.berat}")
    
    
    
    
//     var orang1 = Mbul();
//     orang1.nama = "Makbul";
//     orang1.tinggi = 170;
//     orang1.berat = 55;
    
//     println("orang 1 : ${orang1.nama}, tinggi ${orang1.tinggi}, dan berat ${orang1.berat}")
       
}