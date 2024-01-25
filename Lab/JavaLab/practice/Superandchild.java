class Book {
    private int bookid;
    private int pages;
    public Book(int bookid,int pages){
        this.bookid=bookid;
        this.pages=pages;
    }
    public void display(){
        System.out.println("ID of book is "+bookid);
        System.out.println("Page ="+pages);
    }
}
class FrictionBook extends Book{
    private String name ;
    public FrictionBook(int bookid, int pages, String name ){
        super(bookid, pages);
        this.name =name;
    }
    public void display(){
       
        System.out.println("Name  of book is \""+name+"\"" );
        super.display();
    }
}
class Superandchild{
    public static void main(String[] args) {
        FrictionBook f1= new FrictionBook(344,789,"Your dreams are mine now ");
        f1.display();
    }
}