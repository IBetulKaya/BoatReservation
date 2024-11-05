package model;

public class Model {
    private Users users;
    private Boats boats;
    private Reservations reservations;

    private static Model model;

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Boats getBoats() {
        return boats;
    }

    public void setBoats(Boats boats) {
        this.boats = boats;
    }

    public Reservations getReservations() {
        return reservations;
    }

    public void setReservations(Reservations reservations) {
        this.reservations = reservations;
    }

    public static Model getInstance(){
        if (model==null){
            model= new Model();
        }
        return model;
    }

    private Model() {
    }
}
