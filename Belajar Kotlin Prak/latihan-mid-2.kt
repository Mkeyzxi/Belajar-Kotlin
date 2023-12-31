open class baseModel(var nameModel: String = "base model type", var uid:String = ""){
    private var baseModel: String = "base model type";
    var createdAt: String = "22 september 2023";
    open fun detailModel(baseModel: String){
        println("name model : $nameModel, uid model : $uid, createdAt = $createdAt, baseModel = $baseModel");
    }

}

class User(var nameModel: String = "user", var uid:String) : baseModel(nameModel, uid) {
    private var vole: String = "user";
    override fun detailModel(vole: String){
        println("name model : $nameModel, uid model : $uid, vole = $vole");
    }
    super.detailModel()
    fun updateRole(newRole:String){
        println(newRole)
    }
    fun getRole(newRole:String) : String {
        return newRole
    }
}
class Order(var User,var uid:String) : baseModel(User, uid){
    var nomorOrder: String;
    override fun detailModel(nomorOrder:String){
        println("name model : $nomorOrder, uid model : $uid, baseModel = $User, nomorOrder : $nomorOrder");
    }
    
}



fun main(){
    var basemodel = baseModel("basemodel1","basemodel2")
    var user = User("123","321")
    user.nomorOrder = "12321"
    user.uid = "123"
    user.updateRole("indonesia")
    user.getRole = "hewan"
    user.getRole("manusia")
    var order = Order("order1","order2")
    basemodel.detailModel("nomorOrder")
    order.detailModel("nomorOrder")
    
    
}