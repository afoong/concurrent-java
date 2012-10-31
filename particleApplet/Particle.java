import java.util.Random;

import java.awt.Graphics;

class Particle {
	protected int x;
	protected int y;

	protected final Random rng = new Random();

	public Particle(int iX, int iY) {
		x = iX;
		y = iY;
	}

	public synchronized void move() {
		x += rng.nextInt(10) - 5;
		y += rng.nextInt(20) - 10;
	}

	public void draw(Graphics g) {
		int lx, ly;

		synchronized(this) {
			lx = x;
			ly = y;
		}

		g.drawRect(lx, ly, 10, 10);
	}
}