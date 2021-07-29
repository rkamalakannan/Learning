class Point2D {
    public int x;
    public int y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;

    }
  }

class Solution {

    public boolean isSameSide(Point2D a, Point2d b)
    {
        
    }

    
    public int solution(Point2D[] A) {

        System.out.println(A);

        for (int i = 0; i < A.length; i++) {

            System.out.println(A[i].x);
            
        }

    
        return 0;
        // write your code in Java SE 11
    }


    public static void main(String[] args) {
        Solution sol =  new Solution();
        Point2D p1 = new Point2D(-1, 2);
        Point2D p2 = new Point2D(1, 2);
        Point2D p3 = new Point2D(2, 4);
        Point2D p4 = new Point2D(-3, 2);
        Point2D p5 = new Point2D(2, -2);
      

        Point2D[] A = { p1, p2, p3, p4, p5};

        

       
        sol.solution(A);

    }
}