public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        Post.name = "Иван";
        Post.surname = "Иванов";
        Post.patronomyc = "Иванович";
        Post.passport = "207 316550";
        Post.phone = "+7(912)289-30-21";
        Post.subscription = "True";
        post.birthday = new FormDate();
        post.birthDay = "13";
        post.birthMonth = "05";
        post.birthYear = "1995";
    }
}
