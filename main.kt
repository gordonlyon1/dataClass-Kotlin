fun main() {
  val user = User("Gracia", 19)
  val dataUser = DataUser("Gra", 12)
  val selena = dataUser.copy(nama = "Shelena")

  println(user)
  println(dataUser)
  println(selena)
}

class User (val nama : String, val age : Int)

data class DataUser (val nama : String, val age : Int)