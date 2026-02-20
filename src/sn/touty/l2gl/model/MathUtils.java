package sn.touty.l2gl.model;


public class MathUtils {
    public static double moyenne(double[] notes) {
        double somme = 0;
        for (double n : notes) {
            somme += n;
        }
        return notes.length > 0 ? somme / notes.length : 0;
    }
}
