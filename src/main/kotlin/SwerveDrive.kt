import kotlin.math.hypot

class SwerveDrive(val config: SwerveConfig) {

    fun drive(fwd: Double, str: Double, rot: Double) {
        val A = str - rot * (config.wheelBase / config.r)
        val B = str + rot * (config.wheelBase / config.r)
        val C = fwd - rot * (config.trackWidth / config.r)
        val D = fwd + rot * (config.trackWidth / config.r)
        val ws1 = hypot(A, C)
        val ws2 = hypot(B, D)
        val ws3 = hypot(A, C)
        val ws4 = hypot(A, C)
    }

}