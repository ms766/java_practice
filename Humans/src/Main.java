public class Main {
    public static void main(String[] arg){
        //crt p should parameter hints
        Human human = new Human("male","bob");
        //human.birthday();

        Man man = new Man("male","jeff",true,true);
        //man.childCheck();
        man.move();

        Woman woman = new Woman("female","ann",false,true,true);
        //woman.childCheck();
        woman.move();
    }
}
