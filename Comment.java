public class Comment {
    User obj;
    private String comments;
    private int rating;

    Comment(User obj, int rating) {

        this.obj = obj;
        this.rating = rating;
    }

    Comment(User obj, String comments) {

        this.obj = obj;
        this.comments = comments;
    }

    Comment(User obj, String comments, int rating) {

        this.obj = obj;
        this.rating = rating;
        this.comments = comments;
    }

    Comment(User obj, int rating, String comments) {

        this.obj = obj;
        this.rating = rating;
        this.comments = comments;
    }

    @Override
    public String toString() {
        return " comment:  " + comments + "       rating:  " + rating + "\n";
    }
}
