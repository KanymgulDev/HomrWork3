public class Main {
    public static void main(String[] args) {

      Backend[]backends={
              new Java(),

              new CSharp(),
              new Python()
      };
        for (Backend b: backends) {
            if (b.getClass().equals(Java.class)){
                ((Java) b).spring();
                System.out.println(b.Math(23));
            }
            if (b.getClass().equals(CSharp.class)){
                ((CSharp) b).dotNet(5.2);
                System.out.println(b.Math(67));

            }
            if (b.getClass().equals(Python.class)){
                ((Python) b).django(5);
                b.Math(98);
            }

        }

    }
}