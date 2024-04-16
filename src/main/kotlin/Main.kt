fun main() {
  val car1 = Organisation("20938AD", 23)
    val car2= Organisation("3948AD", 10)
    val car3 = Organisation("298AD", 3)
    val car4 = Organisation("365AD", 26)

    var manage = listOf(car1,car2,car3,car4)
        manage = manage.sortedBy { m -> m.registrationNumber }
  println(manage)


}
// write a program that arranges taxis in how they are supposed to move in and out.
//      PSEUDO CODE
// input the taxi plate, the number and the type .
// arrange the taxis according to their registration number.
// output a list if the arrangement of the taxis according to their order of registration.

data class Organisation(val taxiPlate:String,val registrationNumber:Int)