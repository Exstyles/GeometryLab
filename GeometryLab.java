public class GeometryLab {
    public int f(int x, int y) {
        return x + y;
    }
    
    public int g(int x, int y) {
        return x - y;
    }
    public int h( int x, int y) {
        return x * y;
    }
    public int j( int x, int y) {
        return x / y; 
    }
    public int k( int x, int y) {
        return x % y;
    }
    public int m( int x, int y, int z) {
        return x + y - z;
    }
    public double triArea(int b, int h) {
        return 1.0/2.0 * b * h;
    }
    public double trapArea( double b1, double b2, double h) {
        return 1.0/2.0 * h * (b1 + b2);
    }
    public int rectArea( int b, int h) {
        return b * h;
    }
    public double circArea( double r) {
        return 3.14 * r * r;
    }
    public int paralArea( int b, int h) {
        return b * h;
    }
    public int pythHypotenuse( int a, int b) {
        return a * a + b * b;
    }
    public double triPrismVol( double b, double h, double w) {
        return 1.0/2.0 * b * h * w;
    }
    public int rectPrismVol( int b, int h, int w) {
        return b * h * w ;
    }
    public double rectPyramid( double b, double h, double w) {
        return 1.0/3.0 * b * h * w;
    }
    public double cylVol( double r, double h) {
        return 3.14 * r * r * h;
    }
    public double sphereVol( double r) {
        return 4.0/3.0 * 3.14 * r * r * r;
    }
    public double coneVol(double r, double h) {
        return 1.0/3.0 * 3.14 * r * r * h;
    }
    public double sphereSurfArea( double r) {
        return 4.0 * 3.14 * r * r;
    }
    public double cylSurfArea( double r, double h) {
        return 2.0 * 3.14 * r * h + 3.14 * r * r;
    }
    public double rectPrismSurfArea( double b, double h, double w) {
        return 2.0 * b * h + 2.0 * b * w + 2.0 * h * w; 
        
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    