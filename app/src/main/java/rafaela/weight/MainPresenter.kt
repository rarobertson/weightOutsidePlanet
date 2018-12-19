package rafaela.weight

class MainPresenter {

    val marsGravity = 0.38

    fun calculateWeight(userWeight: Double): String { // Can be decimal. Ex: 75.75
        var result = userWeight * marsGravity
        return "You weight " + Math.round(result).toString() + " on Mars."
    }

    interface OffPlanetWeight {
        fun calculateWeight(userWeight: Double): String
    }
}