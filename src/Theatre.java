import shows.*;
import persons.*;

public class Theatre {

    public static void main(String[] args) {

        Actor firstActor = new Actor("Иван", "Васильевич", Gender.MALE, 185);
        Actor secondActor = new Actor("Жорж", "Милославский", Gender.MALE, 180);
        Actor thirdActor = new Actor("Марфа", "Васильевна", Gender.FEMALE, 170);

        Director firstDirector = new Director("Леонид", "Гайдай", Gender.MALE, 100500);
        Director secondDirector = new Director("Никита", "Михалков", Gender.MALE, 1);

        Show simplShow = new Show("Иван Васильевич меняет профессию", 120, firstDirector);
        Opera opera = new Opera("Борис Годунов", 90, secondDirector, "Бетховен",
                "Краткое описание оперы. Совсем краткое.", 10);
        Ballet ballet = new Ballet("Лебединое озеро", 60, firstDirector, "Вагнер",
                "Танец маленьких утят", "Волочкова");

        System.out.println("\nСпектакль '" + simplShow.getTitle() + "'");
        simplShow.addNewActor(firstActor);
        simplShow.addNewActor(secondActor);
        simplShow.addNewActor(null);

        System.out.println("\nОпера '" + opera.getTitle() + "'");
        opera.addNewActor(secondActor);
        opera.addNewActor(thirdActor);

        System.out.println("\nБаллет '" + ballet.getTitle() + "'");
        ballet.addNewActor(firstActor);
        ballet.addNewActor(thirdActor);

        System.out.println("\nСписок актеров в спектакле:");
        simplShow.printListOfActors();
        System.out.println("\nРежиссер спектакля:");
        simplShow.printDirectorInfo();
        System.out.println("\nСписок актеров в опере:");
        opera.printListOfActors();
        System.out.println("\nРежиссер оперы:");
        opera.printDirectorInfo();
        System.out.println("\nСписок актеров в баллете:");
        ballet.printListOfActors();
        System.out.println("\nРежиссер балета:");
        ballet.printDirectorInfo();

        System.out.println();

        simplShow.changeActor(thirdActor, "Жорж");
        System.out.println("\nСписок актеров в спектакле:");
        simplShow.printListOfActors();

        System.out.println();
        opera.changeActor(firstActor, "Бориска");
        System.out.println();
        opera.changeActor(null, "Жорж");
        System.out.println();
        opera.changeActor(secondActor, "Жорж");
        System.out.println();
        opera.changeActor(thirdActor, "Бориска");

        System.out.println("\nЛибретто оперы.");
        opera.printLibretto();
        System.out.println("\nЛибретто балета.");
        ballet.printLibretto();
    }
}
