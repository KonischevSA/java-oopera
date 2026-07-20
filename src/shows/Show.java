package shows;

import persons.*;
import java.util.ArrayList;

public class Show {

    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    public void addNewActor(Actor newActor) {
        if (checkNewActor(newActor)) {
            addActor(newActor);
        }
    }

    private void addActor(Actor actor) {
        listOfActors.add(actor);
        System.out.println("К участникам '" + title + "' добавлен новый актер:\n" + actor.toString());
    }

    private void removeActor(Actor actor) {
        listOfActors.remove(actor);
        System.out.println("Из участников '" + title + "' удален актер:\n" + actor.toString());
    }

    public void changeActor(Actor newActor, String oldActorSurname) {
        ArrayList<Actor> oldActors = findActorsBySurname(oldActorSurname);
        Actor oldActor = null;

        for(Actor actor: oldActors)
        {
            if(!actor.equals(newActor))
            {
                oldActor = actor;
                break;
            }
        }

        if (checkNewActor(newActor) && oldActor != null) {
            removeActor(oldActor);
            addActor(newActor);
        }
    }

    private boolean checkNewActor(Actor newActor) {
        if (newActor == null) {
            System.out.println("Отсутствует информация о новом актере! Убедитесь, что все данные заполнены верно.");
            return false;
        }

        if (listOfActors.contains(newActor)) {
            System.out.println("Актер " + newActor.getName() + " " + newActor.getSurname() + " уже присутствует в списке участников.");
            return false;
        }

        return true;
    }

    private ArrayList<Actor> findActorsBySurname(String actorSurname) {
        ArrayList<Actor> foundActors = new ArrayList<>();

        for (Actor actor : listOfActors) {
            if (actor.getSurname().equals(actorSurname)) {
                foundActors.add(actor);
            }
        }

        if (foundActors.isEmpty()) {
            System.out.println("Актер по фамилии " + actorSurname + " не найден в списке участников '" + title + "'.");
        }

        return foundActors;
    }

    public String getTitle() {
        return title;
    }

    public void printDirectorInfo() {
        System.out.println(director.toString());
    }

    public void printListOfActors() {
        for (Actor actor : listOfActors) {
            System.out.println(actor.toString());
        }
    }
}
