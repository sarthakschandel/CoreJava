package assignmentProblem;

 public abstract class HPLaptop implements TouchScreenLaptop {
    @Override
   public void scroll(){
        System.out.println("Scroll Method from HPLaptop");
    }
}
