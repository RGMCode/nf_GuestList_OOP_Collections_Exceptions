package RGMCode;

import java.util.List;

public class GuestList {

    private List<String> guests;

    public List<String> getGuests(){
        return guests;
    }

    public void setGuests(List<String> guests) {
        this.guests = guests;
    }

    public String getGuestByName(String name) throws GuestNotFoundException {
        for (String g: guests) {
            if (g.equals(name)){
                return g;
            }
        }
        throw new GuestNotFoundException("There is no guest with the name: " + name);
    }

    public boolean addGuest(String name) {
        return guests.add(name);
    }


/*    public String getGuestByName(String name) {
        if (!guests.contains(name)) {
            throw new GuestNotFoundException("There is no guest with the name: " + name);
        }
        for (String g: guests) {
            if (g.equals(name)){
                return g;
            }
        }
        return name;
    }*/



} //ende im gelaende
