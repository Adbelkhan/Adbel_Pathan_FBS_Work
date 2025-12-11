import java.util.Scanner;
class Book
{
  int isbn;
  String BookName, Author, Category;
  double price;
   
  Book()
  {
     this.isbn=1899;
     this.BookName="Atomic Habits";
     this.Author= "James Clear"; 
     this.Category= "Self-Help";
     this.price = 300;
     
     System.out.println("default constructor get call"+"\n");
  }
  
  Book(int isbn, String BookName, String Author, String Category, double price)
  {
     this.isbn=isbn;
     this.BookName=BookName;
     this.Author=Author; 
     this.Category=Category;
     this.price =price;

     System.out.println("Parameterized constructor get call"+"\n");
  }

 
  void display()
  {
    System.out.println("ISBN No   :" + this.isbn);
    System.out.println("Book Name :" + this.BookName);
    System.out.println("Author    :" + this.Author);
    System.out.println("Category  :" + this.Category);
    System.out.println("Price     :" + this.price);
  }
  void setIsbn(int b)
  {
    this.isbn = b;
  }
  void setBookName(String b)
  {
    this.BookName = b;
  }
  void setAuthor(String b)
  {
    this.Author = b;
  }
  void setCategory(String b)
  {
    this.Category = b;
  }
  void setPrice(double b)
  {
    this.price = b;
  }

  int getIsbn()
  {
    return this.isbn;
  }
  String getBookName()
  {
    return this.BookName;
  }
  String getAuthor()
  {
    return this.Author;
  }
  String getCategory()
  {
    return this.Category;
  }
  double getPrice()
  {
    return this.price;
  }

}// class Book ends here 

class TestBook
{
  public static void main(String args[])
  {
    Book b1;
    b1 = new Book();
    b1.setIsbn(9789);
    b1.setBookName("Let Us C");
    b1.setAuthor("Yashavant Kanetkar");
    b1.setCategory("C Language");
    b1.setPrice(450);

    b1.getIsbn();
    b1.getBookName();
    b1.getAuthor();
    b1.getCategory();
    b1.getPrice();

    b1.display();
    Book b2= new Book(1222,"hakings", "James", "Stranger things", 400);

    Book b3=new Book();
    Scanner sc=new Scanner(System.in);
     
    System.out.println("Enter an ISBN");
    int isbn=sc.nextInt();
     
    sc.nextLine();

    System.out.println("Enter BookName");
    String BookName=sc.nextLine();

    System.out.println("Enter Author");
    String Author=sc.nextLine();
    
    System.out.println("Enter Category");
    String Category=sc.nextLine();
   
    System.out.println("Enter Price");
    double price=sc.nextDouble();

    System.out.println("Entered ISBN " + isbn);
    System.out.println("Entered BookName " + BookName);
    System.out.println("Entered Author " + Author);
    System.out.println("Entered Category " + Category);
    System.out.println("Entered Price " + price);
    
  }

}// class TestBook ends here