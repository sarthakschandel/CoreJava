package assignmentProblem;

 public abstract class DellLaptop implements TouchScreenLaptop {
    @Override
   public void scroll(){
        System.out.println("Scroll Method from DellLaptop");
    }
}
