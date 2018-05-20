public class P4_Triangle_of_55_Stars {
    public static void main(String[] args) {
        //Декларираме стринг star и му задаваме начална стойност
        String star = "*";
        //Използваме цикъл който се завърта 10 пъти за да отпрчатаме стойността на стринга
        for (int i = 0; i < 10; i++) {
            System.out.println(star);
            //След всяко отпечтване добаваме  по една зездва към стринга
            star += "*";
        }
    }
}

