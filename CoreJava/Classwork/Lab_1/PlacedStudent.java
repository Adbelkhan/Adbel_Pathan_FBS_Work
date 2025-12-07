class PlacedStudent
{
  int frn;
  String name;
  double distance;
  String CompanyName;
  String designation;

  void display()
  {
    System.out.println("FRN :" + this.frn);
    System.out.println("Name :" + this.name);
    System.out.println("Distance :" + this.distance);
    System.out.println("Company Name :" + this.CompanyName);
    System.out.println("Designaton :" + this.designation);
  }

}//clsass placedStudent ends here

class TestPlacedStudent
{
    public static void main(String arg[])
    {
      PlacedStudent ps1;
      ps1 = new PlacedStudent();
      ps1.frn = 113;
      ps1.name = "Walter";
      ps1.distance = 60;
      ps1.CompanyName = "TATA";
      ps1.designation = "Manager";
      ps1.display();
    }
}// class TestPlacedStudent ends here