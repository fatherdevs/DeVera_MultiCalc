package mcm.edu.ph.devera_multicalc;

public class AllTheFormulas {
    //Density Formula
    public double Density(double mass, double volume){
        return mass / volume;
    }
    //Power Formula
    public double Power(double work, double time){
        return work/time;
    }
    //Newton Formula
    public double Newton(double mass, double acceleration){
        return mass * acceleration;
    }
    //Weight Formula
    public double Weight(double mass, double gravity){
        return mass * gravity;
    }
    //Acceleration Formula
    public double Acceleration(double velocity, double time){
        return velocity/time;
    }
}
