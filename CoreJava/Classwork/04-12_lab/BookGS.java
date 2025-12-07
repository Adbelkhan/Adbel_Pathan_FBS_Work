class Book
{
  int isbn;
  String BookName, Author, Category;
  double price;
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
    b1.setIsbn(1899);
    b1.setBookName("Atomic Habits");
    b1.setAuthor("James Clear");
    b1.setCategory("Self-Help");
    b1.setPrice(300);

    b1.getIsbn();
    b1.getBookName();
    b1.getAuthor();
    b1.getCategory();
    b1.getPrice();

    b1.display();
    Book b2= new Book();
    b2.display();

  }

}// class TestBook ends here