public class immutable2{

    class MutableBook {
        private String title;

        public String getTitle(){
            return this.title;
        }
        //setter, class is immutable
        public void setTitle(String title){
            this.title = title;
        }
    }

    public class ImmutableReader {
        private final MutableBook readersBook;
        private final int page;

        public ImmutableReader(MutableBook book){
            this(book, 0);
        }

        private ImmutableReader(MutableBook book, int page){
            this.page = page;

            MutableBook bookCopy = new MutableBook();
            bookCopy.setTitle(book.getTitle());
            this.readersBook = bookCopy;
        }

        public MutableBook getBook() {
            MutableBook bookCopy = new MutableBook();
            bookCopy.setTitle(this.readersBook.getTitle());
            return bookCopy;
        }

        public int getPage() {
            return page;
        }

        public ImmutableReader turnPage() {
            return new ImmutableReader(this.readesBook, page + 1);
        }
    }
}


/*  

Immutable objects are automatically thread-safe, the overhead caused due to use of synchronisation is avoided.
Once created the state of the immutable object can not be changed so there is no possibility of them getting into an inconsistent state.
The references to the immutable objects can be easily shared or cached without having to copy or clone them as there state can not be changed ever after construction.
The best use of the immutable objects is as the keys of a map.




*/