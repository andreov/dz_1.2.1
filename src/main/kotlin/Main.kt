fun main() {
    val commissionCard = 0.75
    val amount = 100_000*100
    val minCommission = 35*100
    val commission = amount*commissionCard/100
    val resultCommission  =if (commission<=minCommission) minCommission else commission
    println("Коммисия за перевод: $resultCommission коп.")
}