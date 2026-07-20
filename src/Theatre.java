import shows.*;
import persons.*;

public class Theatre {

    public static void main(String[] args) {

        Actor ivanGrozniy = new Actor("Иван", "Рюрикович", Gender.MALE, 185);
        Actor georgMiloslavskiy = new Actor("Жорж", "Милославский", Gender.MALE, 180);
        Actor marphaVasilievna = new Actor("Марфа", "Рюриковна", Gender.FEMALE, 170);
        Actor ivanBunsha = new Actor("Иван", "Рюрикович", Gender.MALE, 184);
        Actor lgeDmitriy = new Actor("Дмитрий", "Рюрикович", Gender.MALE, 185);

        Director firstDirector = new Director("Леонид", "Гайдай", Gender.MALE, 100500);
        Director secondDirector = new Director("Никита", "Михалков", Gender.MALE, 1);

        Show simplShow = new Show("Иван Васильевич меняет профессию", 120, firstDirector);
        Opera opera = new Opera("Борис Годунов", 90, secondDirector, "Бетховен",
                "Краткое описание оперы. Совсем краткое.", 10);
        Ballet ballet = new Ballet("Лебединое озеро", 60, firstDirector, "Вагнер",
                "Танец маленьких утят", "Волочкова");

        System.out.println("\nСпектакль '" + simplShow.getTitle() + "'");
        simplShow.addNewActor(ivanGrozniy);
        simplShow.addNewActor(georgMiloslavskiy);
        simplShow.addNewActor(lgeDmitriy);
        simplShow.addNewActor(null);

        System.out.println("\nОпера '" + opera.getTitle() + "'");
        opera.addNewActor(georgMiloslavskiy);
        opera.addNewActor(marphaVasilievna);

        System.out.println("\nБаллет '" + ballet.getTitle() + "'");
        ballet.addNewActor(ivanGrozniy);
        ballet.addNewActor(marphaVasilievna);

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

        simplShow.changeActor(ivanBunsha, "Рюрикович");
        System.out.println("\nСписок актеров в спектакле:");
        simplShow.printListOfActors();

        System.out.println();
        opera.changeActor(ivanGrozniy, "Бориска");
        System.out.println();
        opera.changeActor(null, "Милославский");
        System.out.println();
        opera.changeActor(georgMiloslavskiy, "Милославский");
        System.out.println();
        opera.changeActor(marphaVasilievna, "Бориска");

        System.out.println("\nЛибретто оперы.");
        opera.printLibretto();
        System.out.println("\nЛибретто балета.");
        ballet.printLibretto();

        System.out.println();
    }
}
