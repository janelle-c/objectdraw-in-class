package smcs.battis.fancypattern;

import objectdraw.*;

public class Pattern {

	private Location origin;
	private FilledOval[][] p;
	
	public Pattern(int x, int y, DrawingCanvas canvas) {
		origin = new Location(x, y);
		p = new FilledOval[10][];
		
		/* draw our pattern the first time */
		for (int row = 0; row < 10; row++) {
			if (row % 2 == 0) {
				p[row] = new FilledOval[9];
				for (int col = 0; col < 9; col++) {
					p[row][col] = new FilledOval(x + 20 * col + 10, y + 20 * row, 15, 15, canvas);
				}
			} else {
				p[row] = new FilledOval[10];
				for (int col = 0; col < 10; col++) {
					p[row][col] = new FilledOval(x + 20 * col, y + 20 * row, 15, 15, canvas);
				}
			}
		}
	}

	public void moveTo(Location m) {
		double dx, dy;
		dx = m.getX() - origin.getX();
		dy = m.getY() - origin.getY();
		for (int row = 0; row < p.length; row++) {
			for (int col = 0; col < p[row].length; col++) {
				p[row][col].move(dx, dy);
			}
		}
		origin = m;
	}

}
