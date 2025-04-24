// Exercise A

// class Exercise1a {
//      public static void main(String[] args) {
//        int x = 1;
//        while (x < 10) {
//          if (x > 3) {
//            System.out.println("big x");
//          }
//        }
//      }
//     }

// missing the increment -> x=x+1;
// correction

public class pg21Exercise1a {
    public static void main(String[] args) {
      int x = 1;
      while (x < 10) {
        if (x > 3) {
          System.out.println("big x");
        }
        x=x+1;
      }
    }
   }