package util;

public class Time {
    // Time system
    // Started time
    public  static float timeStarted = System.nanoTime();
    // Get time
    public static float getTime() {
        return (float)(((System.nanoTime() - timeStarted))*1E-9);
    }
}
