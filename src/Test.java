import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ProgrammingBook book_1 = new ProgrammingBook(100101,"Clean Code", 107000,"Robert C.Martin", "English", "Programming");
        ProgrammingBook book_2 = new ProgrammingBook(100102,"The Pragmatic Programmer",150000,"Andrew Hunt & David Thomas", "English","Programming");
        ProgrammingBook book_3 = new ProgrammingBook(100103,"Code Complete",150000,"Steve McConnell", "English","Programming");
        ProgrammingBook book_4 = new ProgrammingBook(100104,"Ruby on Rails 4.0 Guide",135000,"Phạm Quốc Dân", "English","Programming");
        ProgrammingBook book_5 = new ProgrammingBook(100105,"Code Dạo Ký Sự",110000,"Huy Hoàng", "Tiếng Việt","Programming");

        DetectiveBook book_6 = new DetectiveBook(200206,"Sherlock Holmes Trọn Bộ", 300000,"Conan Doyle","Tiếng Việt","Detective");
        DetectiveBook book_7 = new DetectiveBook(200207,"Án Mạng Trên Chuyến Tàu Tốc Hành Phương Đông", 90000,"Agatha Christie","Tiếng Việt","Detective");
        DetectiveBook book_8 = new DetectiveBook(200208,"Án Mạng A.B.C", 70000,"Agatha Christie","Tiếng Việt","Detective");
        DetectiveBook book_9 = new DetectiveBook(200209,"Kỳ Nghỉ Hè Của Poirot", 65000,"Agatha Christie","Tiếng Việt","Detective");
        DetectiveBook book_10 = new DetectiveBook(200210,"Bố Già", 170000,"Mario Puzo","Tiếng Việt","Detective");


        Book[] allBook = new Book[10000];
        allBook[0] = book_1;
        allBook[1] = book_2;
        allBook[2] = book_3;
        allBook[3] = book_4;
        allBook[4] = book_5;
        allBook[5] = book_6;
        allBook[6] = book_7;
        allBook[7] = book_8;
        allBook[8] = book_9;
        allBook[9] = book_10;




        //--------Creat the Menu--------//
        int choice = -1;
        System.out.println("Welcome to Java Library");
        System.out.println("Menu : ");
        System.out.println("1 : Find Book by Name ");
        System.out.println("2 : Find Book by Author ");
        System.out.println("3 : Find Book by Category ");
        System.out.println("4 : Find Book by Language ");
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();

        while (choice != 0) {
            if (choice == 1) {
                System.out.println("Enter Book Name : ");
                String request = sc.nextLine();
                System.out.println(request);
                boolean found = false;
                   for (int i = 0; i<Book.amountBook(); i++) {
                       String bookName = allBook[i].getName();
                       bookName = bookName.toUpperCase();
                       request = request.toUpperCase();
                       if (bookName.contains(request) && request != null) {
                           found = true;
                           System.out.println(allBook[i].toString());
                       }
                   }
                   if (found == false){
                       System.out.println("Book not found");
                   }
               }


            //find by author
            if (choice == 2) {
                System.out.println("Enter Author Name : ");
                String request = sc.nextLine();
                int count = 0;
                for (int i=0; i< Book.amountBook(); i++) {
                    String bookAuthor = allBook[i].getAuthor();
                    bookAuthor = bookAuthor.toUpperCase();
                    request = request.toUpperCase();
                    if (bookAuthor.contains(request)) {
                        System.out.println("Book was found : ");
                        System.out.println(allBook[i].toString());
                        count   ++;
                    }
                }
                if (count ==0) {
                    System.out.println("Author not found");
                }
            }

            //find by category
            if (choice == 3) {
                System.out.println("Enter Category : ");
                String request = sc.nextLine();
                int count = 0;
                for (int i=0; i< Book.amountBook(); i++) {
                    String bookCategory = allBook[i].getCategory();
                    bookCategory = bookCategory.toUpperCase();
                    request = request.toUpperCase();
                    if (bookCategory.contains(request)) {
                        System.out.println("Book was found : ");
                        System.out.println(allBook[i].toString());
                        count   ++;
                    }
                }
                if (count ==0) {
                    System.out.println("No book in your category you search");
                }
            }

            if (choice == 4) {
                System.out.println("Enter Language : ");
                String request = sc.nextLine();
                for (int i =0; i<Book.amountBook(); i++) {
                    String bookLanguage = allBook[i].getLanguage();
                    bookLanguage = bookLanguage.toUpperCase();
                    request = request.toUpperCase();
                    if (bookLanguage.contains(request)) {
                        System.out.println("Found your request  : ");
                        System.out.println(allBook[i].toString());
                        System.out.println();
                    }
                    else {
                        System.out.println("This language was not found");
                    }
                }
            }
        }
    }
}
