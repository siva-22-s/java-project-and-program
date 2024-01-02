package inter;

public class DoWhileLoop {
	    public static void main(String[] args) {
	        int rows = 5;
	        int columns = 3;

	        int i = 1;
	        do {
	            int j = 1;
	            do {
	                if (j == columns) {
	                    System.out.print("* ");
	                } else {
	                    System.out.print("1 ");
	                }
	                j++;
	            } while (j <= columns);

	            System.out.println(i);
	            i++;
	        } while (i <= rows);
	    }
	}
