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
	private long endTime;

	public void start() {
		this.started = true;
		this.startTime = System.currentTimeMillis();
	}

	public double stop() {

		if (!this.started)
			return 0d;

		this.endTime = System.currentTimeMillis();
		this.started = false;
		return (this.endTime - this.startTime) / 1000d;
	}

}
