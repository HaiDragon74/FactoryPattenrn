fun main(args: Array<String>) {
    val loaiXe=LoaiXe("xemay")
    val xe= loaiXe.getSoBanh()
    xe?.banhXe()
}
interface PhuongTien{
    fun banhXe()
}
class XeMay():PhuongTien{
    override fun banhXe() {
        println("Xe may co 2 banh")
    }
}
class XeCon():PhuongTien{
    override fun banhXe() {
        println("Xe con co 4 banh")
    }
}
class LoaiXe(){
    var xe:String = ""
    private var mPhuongTien:PhuongTien?=null
    constructor(xe:String) : this() {
        this.xe=xe
        if (xe=="xemay"){
            mPhuongTien=XeMay()
        }else if (xe=="xecon")
            mPhuongTien=XeCon()
        else
            println("thong tin sai")
    }
    fun getSoBanh():PhuongTien?{
        return mPhuongTien
    }
}
