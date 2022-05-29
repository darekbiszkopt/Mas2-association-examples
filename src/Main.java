public class Main {
    public static void main(String[] args) throws Exception {

        // normal association
      /*  Client client = new Client("Dariusz");

        Bank alior = new Bank("Alior Bank");
        Bank mbank = new Bank("MBank");

        client.addBank(alior);
        client.addBank(mbank);

        System.out.println(client);*/
        //
        // attribute association
        /*Actor jonnyDeep = new Actor("Jonny Deep");
        Actor leoDiCaprio = new Actor("Leonardo di Caprio");

        Studio hollywood = new Studio("Hoolywood");

        Movie wolf = new Movie("Wilk z Wallstreet");
        Movie pirates = new Movie("Piraci z Karaibow");
        Movie titanic = new Movie("Titanic");

        jonnyDeep.addStudio(hollywood);
        leoDiCaprio.addStudio(hollywood);
        wolf.addStudio(hollywood);
        pirates.addStudio(hollywood);
        titanic.addStudio(hollywood);

        System.out.println(hollywood);*/


        //
        // qualified association
     /*   Academy pjatk = new Academy("Polsko-Japonska ATK");
        Academy pw = new Academy("PW");
        Student darek = new Student("Dariusz Dajcz", "s21522");
        Student szymon = new Student("Szymon Kowalski", "s21533");
        Student natalia = new Student("Natalia M", "s23368");
        pjatk.addStudent(darek);
        pjatk.addStudent(szymon);
        pjatk.addStudent(natalia);
        pw.addStudent(natalia);


        System.out.println(pjatk);
        System.out.println(pw);*/

        //
        // composition

        Car car = new Car("Audi", "A5");
        Engine engine = null;
        Engine.createEngine("V8", "XX", car);

        System.out.println(car);

    }
}
