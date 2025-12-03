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

}// class Book ends here 

class TestBook
{
  public static void main(String args[])
  {
    Book b1;
    b1 = new Book();
    b1.isbn = 1899;
    b1.BookName = "Atomic Habits";
    b1.Author = "James Clear";
    b1.Category = "Self-Help";
    b1.price = 300;
    b1.display();
  }

}// class TestBook ends here