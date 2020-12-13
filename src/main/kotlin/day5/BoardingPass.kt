package day5

class BoardingPass(private val value: String) {
    var binaryValue = ""

    fun createBoardingPass() {
        binaryValue = value.replace('L', '0').replace('R', '1').replace('F', '0').replace('B', '1')
        binaryValue = Integer.parseInt(binaryValue, 2).toString()
    }
}