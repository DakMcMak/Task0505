public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 3, 5, 10);
        Cat cat1 = new Cat("Vova", 4, 2, 15);
        Cat cat2 = new Cat("Denis", 7, 4, 12);
        cat1.fight(cat2);
        System.out.println(true);
        cat2.fight(cat);
        System.out.println(true);
        cat.fight(cat1);
        System.out.println(true);
    }

    public static class Cat {
        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int agePlus = this.age > anotherCat.age ? 1 : 0;
            int weightPlus = this.weight > anotherCat.weight ? 1 : 0;
            int strengthPlus = this.strength > anotherCat.strength ? 1 : 0;

            int score = agePlus + weightPlus + strengthPlus;
            return score > 2; // return score > 2 ? true : false;
        }
    }
}
