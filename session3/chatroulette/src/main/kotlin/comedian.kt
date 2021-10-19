class Comedian (override val name:String): Person(name){
    override fun talk(){
        joke()
    }

    fun joke(){
        println("I always tell the truth, even when I lie")
    }
}