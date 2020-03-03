package dev.yavuztas.samples.utils;

/**
 * Utility class for calculate code execution time in seconds
 * 
 * @author Yavuz Tas
 *
 */
public class Stopwatch {

	private boolean started;
	private long startTime;

	public void start() {
		this.started = true;
		this.startTime = System.currentTimeMillis();
	}

	public double stop() {

		if (!this.started)
			return 0d;

		this.started = false;
		return (System.currentTimeMillis() - this.startTime) / 1000d;
	}

}
