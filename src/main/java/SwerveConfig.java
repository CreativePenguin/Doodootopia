import com.kauailabs.navx.frc.AHRS;

public class SwerveConfig {
    public AHRS gyro;
    public double trackWidth;
    public double wheelBase;
    public final double r = pythagoreanTheorem(trackWidth, wheelBase);
    Wheel[] wheels;

    /**
     * Swerve Config is created to store the different vars needed for swerve
     *
     * @param gyro The gyro. Needed for Field Oriented driving
     * @param trackWidth The dist from front to  back of the bot (length)
     * @param wheelBase The dist from right to left of bot (thiccness)
     */
    public SwerveConfig(AHRS gyro, double trackWidth, double wheelBase) {
        this.gyro = gyro;
        this.trackWidth = trackWidth;
        this.wheelBase = wheelBase;
    }

    public double pythagoreanTheorem(double a, double b) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }
}
