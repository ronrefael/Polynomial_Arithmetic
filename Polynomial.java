
abstract class Polynomial  {
		   DList<Term> data = null;
		   public Polynomial() {
		      data = new DList<>();
		   }
		   public final String toString() {
		      String ans = "";
		      boolean starting = true;
		      try {
		         DNode<Term> n = data.getFirst();
		         while (n != null) {
		            if (!starting && n.getData().isPositive()) ans += " +";
		            starting = false;
		            ans += " " + n.getData().toString();
		            n = data.getNext(n);
		         }
		      } catch (Exception e) {
		         if (starting) return "0";
		      }
		      return ans;
		   }
		   abstract public Polynomial add(Polynomial p);
		   abstract public Polynomial subtract(Polynomial p);
		   abstract public Polynomial multiply(Polynomial p);
		   abstract public Polynomial divide(Polynomial p) throws Exception;
		   abstract public Polynomial remainder(Polynomial p) throws Exception;
		}

class Utility {
	   public static void run(Polynomial p, Polynomial q) throws Exception {
	      System.out.println("Polynomials\np = " + p + "\nq = " + q);
	      System.out.println("Sum " + p.add(q));
	      System.out.println("Difference " + p.subtract(q));
	      System.out.println("Product " + p.multiply(q));
	      System.out.println("Quotient " + p.divide(q));
	      System.out.println("Remainder " + p.remainder(q));
	   }
	}