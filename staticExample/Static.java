package staticExample;

public class Static {

     String job = "Rahul is Selected!";

    // class Test  // ERROR
      static class Test{
        String name;
        static int num = 69;

        public Test(String name) {
            this.name = name;
            Static JOB = new Static();
            System.out.println("Innner class : " + JOB.job);
        }

    }

    public static void main(String[] args) {
        Static st = new Static();
        st.info();

//        Static.Test a = st.new Test("Kunal");
////
//        System.out.println(Test.num);
//        System.out.println(a.num);
//        Static.Test b = st.new Test("Rahul");
        Test a = new Test("Kunal");

        Test b = new Test("Rahul");

        System.out.println(a.name); // Kunal
        System.out.println(b.name); // Rahul
    }
    public void info(){
        System.out.println("This is info");
    }

}