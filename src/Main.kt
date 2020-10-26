fun main (){
    var kordinati1 = point(X = 4F , Y = 9F)

    var kordinati2 = point(X = 8F , Y = 15F )


    println(kordinati1)
    println(kordinati2)
    println(kordinati1 == kordinati2)
    kordinati1.moveX(4F)
    kordinati2.moveY(9F)


} class point(X:Float, Y:Float) {

    private var X: Float = X
    private var Y: Float = Y

    fun moveX(k:Float){
        var v = Y - k
        println("კორდინატი1 X-ის მიმართ გადავა:$X;$v კორდინატებში")

    }
    fun moveY(m:Float){
        var v = X - m
        println("კორდინატი2 Y-ის მიმართ გადავა:$v;$Y კორდინატებში")
    }


    override fun toString(): String {
        return "($X;$Y)"
    }

    override fun equals(other: Any?): Boolean {
        if (other is point) {
            if (X == other.X && Y == other.Y) {
                return true
            }
        }
        return false
    }
}
