class Date
{
  int day, month, year;

}
class TestDate
{
  public static void main(String args[])
  {
    Date d1; 
    d1= new Date();
    d1.day=2;
    d1.month=12;
    d1.year= 2025;

    System.out.println("\n" + d1.day + "/" + d1.month + "/" + d1.year);

    System.out.println(d1);
    Date d2= new Date();
    System.out.println(d2);
  }
}
