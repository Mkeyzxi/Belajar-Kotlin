open class BaseModel(var nameModel:String = "base model type",var uid:String = "",var createdAt: String = "11 sep 2023"
){
    private var baseModel:String = "base model type"; 
    open fun detailModel(){
        println("Name Model : $nameModel, Base Model : $baseModel, UID : $uid, Created At : $createdAt")
    }
}

class Order(var nomorOrder:String,var user:String = "nin",uid:String) : BaseModel(nomorOrder,user,uid){
    override fun detailModel(){
        println("Nomor Order : $nomorOrder, User : $user, UID : $uid, Created At : $createdAt")
    }
}

class User(var nameModel:String = "user type",uid:String) : BaseModel(nameModel,uid){
    private var role:String = "user role";
    
    fun updateRole() : String{
        super.detailModel()
        return "role = ${this.role}";
    }

}

fun main(){
    var basemodel = BaseModel()
    var order = Order("1223","421","432")
    var user = User("kska","saha")
    // var user = User("1232","213");
    basemodel.detailModel()
    order.detailModel()
    // user.detailModel()
    user.updateRole()
}









// class User(var nameModel:String = "user type", var uid:String) : BaseModel(){
//     private var vole:String = "vole"
//     override fun detailModel(){
//         println("Name Model : $nameModel, Base Model : $baseModel, UID : $uid, Created At : $createdAt")
//     }
//     fun updateRole(var newRole:String = "ini role"){
//         println(newRole)
//     }
//     fun getRole(vole) : String {
//         $this.vole = vole
//         return vole;
//     }