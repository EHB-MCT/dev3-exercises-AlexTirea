fun main () {
    val chatPartners = arrayOf(Person("alex"), Person("arno"), Person("nico"))

    val chatPartner = chatPartners.random()
    chatPartner.introduce()
    chatPartner.talk()
}