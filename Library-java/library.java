class library {
    private String title;
    private boolean isAvaliable = true;

    public library(String title) {
        this.title = title;
    }

    public void issuebook() {
        if(isAvaliable) {
            isAvaliable = false;
            System.out.println("Book '" + title + "' has been issued.");
        } else {
            System.out.println("Sorry, '" + title + "' is currently unavailable.");
        }
    }

    public void returnbook() {
        if(!isAvaliable) {
            isAvaliable = true;
            System.out.println("Book '" + title + "' has been retured.");
        } else {
            System.out.println("Book '" + title + "' was not issued.");
        }
    }

    public static void main(String[] args) {
        library book = new library("Clean Code");
        book.issuebook();
        book.issuebook();
        book.returnbook();
    }
}