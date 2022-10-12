package Adapter;

public class TestAdapter {
	public static void main(String[] args) {

        // round fits round, of course
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        if (hole.fits(rpeg)) {
            System.out.println("Round peg r5 fits round hole r5.");
        }

        SquarePeg smallSqPeg = new SquarePeg(7);
        SquarePeg largeSqPeg = new SquarePeg(8);
        // hole.fits(smallSqPeg); // won't compile

        // adapter solves the problem
        System.out.print("Square peg w"+smallSqPeg.getWidth()+" ");
        if (hole.fits(new SquarePegAdapter(smallSqPeg))) {
            System.out.print("fits");
        } else {
        	System.out.print("does not fit");
        }
        System.out.println(" into round hole radius r"+hole.getRadius());
        
        System.out.print("Square peg w"+largeSqPeg.getWidth()+" ");
        if (hole.fits(new SquarePegAdapter(largeSqPeg))) {
            System.out.print("fits");
        } else {
        	System.out.print("does not fit");
        }
        System.out.println(" into round hole radius r"+hole.getRadius());

    }
}
