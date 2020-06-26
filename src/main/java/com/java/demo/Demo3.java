package com.java.demo;

public class Demo3 {
	private final double ry;
	private final double rx;
	private final double q;

	public Demo3(double x0, double y0, double q0) {
		// TODO Auto-generated constructor stub
		this.rx = x0;
		this.ry = y0;
		this.q = q0;
	}

	public double potentialAt(double x, double y) {
		// TODO Auto-generated constructor stub
		double k = 8.99e09;
		double dx = x - rx;
		double dy = y - ry;
		return k * q / Math.sqrt(dx * dx + dy * dy);

	}

	public static void main(String[] args) {
		double x = Double.parseDouble(args[0]);
		double y = Double.parseDouble(args[1]);
		Demo3 c1 = new Demo3(0.51, 0.63, 21.3);
		Demo3 c2 = new Demo3(0.13, 0.94, 81.9);
		double v1 = c1.potentialAt(x, y);
		double v2 = c2.potentialAt(x, y);
		System.out.printf("%.2e\n", (v1 + v2));
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return q + " at " + "(" + rx + "," + ry + ")";
	}
}
