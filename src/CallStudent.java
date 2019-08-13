public class CallStudent { 
    
  public static void main(String[] args) {
    System.out.println("Hello");
    Student vilailak = new Student();
      System.out.println("object vilailak = " +vilailak);
    vilailak.addCoures();
    vilailak.dropCoures();
    vilailak.paymect();
    vilailak.enrollment();
    
    //creete object GraduacesStuden
     GraduacesStudent kate = new GraduacesStudent();
     System.out.println("object kate = " +kate);
     kate.oralExamination();
     kate.thesisExamination();
     kate.addCoures();
     kate.dropCoures();
     kate.paymect();
     kate.enrollment();
  }
    
}
