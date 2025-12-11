class PlacedStudent
{
  int frn;
  String name;
  double distance;
  String CompanyName;
  String designation;
  
  PlacedStudent()
  {
    this.frn=122;
    this.name="Sachin";
    this.distance=20;
    this.CompanyName="Infosys";
    this.designation="Employee";
    System.out.println("default constructor get call"+"\n");
  }
  
  PlacedStudent(int frn, String name, double distance, String CompanyName, String designation)
  {
    this.frn=frn;
    this.name=name;
    this.distance=distance;
    this.CompanyName=CompanyName;
    this.designation=designation;
    System.out.println("Parameterised constructor get call"+"\n");
  }


  void display()
  {
    System.out.println("FRN :" + this.frn);
    System.out.println("Name :" + this.name);
    System.out.println("Distance :" + this.distance);
    System.out.println("Company Name :" + this.CompanyName);
    System.out.println("Designaton :" + this.designation);
  }

  void setFrn(int ps)
  {
    this.frn =ps;
  }
  void setName(String ps)
  {
    this.name =ps;
  }
  void setDistance(double ps)
  {
    this.distance =ps;
  }
  void setCompanyName(String ps)
  {
    this.CompanyName =ps;
  }
  void setDesignation(String ps)
  {
    this.designation =ps;
  }

  int getFrn()
  {
    return this.frn;
  }
  String getName()
  {
    return this.name;
  }
  double getDistance()
  {
    return this.distance;
  }
  String getCompanyName()
  {
    return this.CompanyName;
  }
  String getDesignation()
  {
    return this.designation;
  }


}//clsass placedStudent ends here

class TestPlacedStudent
{
    public static void main(String arg[])
    {
      PlacedStudent ps1;
      ps1 = new PlacedStudent();
      ps1.setFrn(113);
      ps1.setName("Walter");
      ps1.setDistance(60);
      ps1.setCompanyName("TATA");
      ps1.setDesignation("Manager");

      ps1.getFrn();
      ps1.getName();
      ps1.getDistance();
      ps1.getCompanyName();
      ps1.getDesignation();

      ps1.display();
      PlacedStudent ps2= new PlacedStudent(224,"Ashish",70,"apple","developer");
    }
}// class TestPlacedStudent ends here