class Teacher (override val name:String): Person(name) {
    override fun talk(){
        fact()
    }

    fun fact(){
        println("Way too long of a theory session")
    }
}