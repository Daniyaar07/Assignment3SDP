public class Main {
    public static int passed =0;
    public static void main(String[] args){
            runDemo();
    }
    public static void runDemo() {
        Renderer vector = new VectorRenderer();
        Renderer raster = new RasterRenderer();

        Circle c1 = new Circle("C1", 2, vector);
        check("T1", c1.execute(), "Vector circle radius=2");

        Circle c2 = new Circle("C2", 2, raster);
        check("T2", c2.execute(), "Raster circle radius=2");

        Square s1 = new Square("S1", 3, vector);
        check("T3", s1.execute(), "Vector square side=3");

        Square s2 = new Square("S2", 3, raster);
        check("T4", s2.execute(), "Raster square side=3");

        Circle c3 = new Circle("C3", 2, vector);

        Circle oldObject = c3;
        String oldId = c3.getId();
        int oldRadius = c3.getRadius();

        String before = c3.execute();
        c3.setImplementation(raster);
        String after = c3.execute();
        boolean sameObject = oldObject == c3;
        boolean sameData = oldId.equals(c3.getId()) && oldRadius == c3.getRadius();

        if (sameObject && sameData && before.equals("Vector circle radius=2") && after.equals("Raster circle radius=2")) {
            passed++;
            System.out.println("T5 Pass | sameObject=" + sameObject + "| sameData=" + sameData);
        } else {
            System.out.println("T5 fail");
        }
        System.out.println("before=" + before);
        System.out.println("after=" + after);
        System.out.println("Summary:" + passed + "/5 pass");
    }
        public static void check(String test , String actual , String expected){
            if(actual.equals(expected)) {
                passed++;
                System.out.println(test + "Pass | result" + actual);
            }
            else{
                System.out.println(test + "Fail | result" + actual);
                System.out.println("expected=" + expected);
            }
    }
}
