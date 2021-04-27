package wundermancommerce;

public class Relatives {
	private Relation relationShip;
    private People person;

    public Relatives(Relation relationShip, People person) {
        super();
        this.relationShip = relationShip;
        this.person = person;
    }

    public Relation getRelationShip() {
        return relationShip;
    }

    public void setRelationShip(Relation relationShip) {
        this.relationShip = relationShip;
    }

    public People getPerson() {
        return person;
    }

    public void setPerson(People person) {
        this.person = person;
    }
}
