public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.surname = "Иванов";
        post.patronomyc = "Иванович";
        post.passport = "207 316550";
        post.phone = "+7(912)289-30-21";
        post.subscription = Boolean.parseBoolean(String.valueOf(true));
        post.birthDay = new FormDate();
        post.birthDay.day = 13;
        post.birthDay.month = 05;
        post.birthDay.year = 1995;
    }
}
