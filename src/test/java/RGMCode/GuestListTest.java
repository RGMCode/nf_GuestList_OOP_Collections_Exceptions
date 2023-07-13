package RGMCode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GuestListTest {

    @Test
    void shouldBeEmptyInitially(){

        //given
        GuestList guestList = new GuestList();
        guestList.setGuests(List.of());
        //when
        List<String> actual = guestList.getGuests();
        //then
        assertEquals(List.of(), actual);
    }

    @Test
    void shouldReadSameGuestsAsWrittenBefore(){
        //given
        GuestList guestList = new GuestList();
        guestList.setGuests(List.of("Karl", "Ute"));
        //when
        List<String> actual = guestList.getGuests();
        //then
        assertEquals(List.of("Karl", "Ute"), actual);
    }

    @Test
    void getGuestByName(){
        //given
        GuestList guestList = new GuestList();
        guestList.setGuests(List.of("Karl", "Ute"));
        //when & then
        try{
            guestList.getGuestByName("Stephan");
            fail();
        } catch (GuestNotFoundException e){
            assertTrue(true);
        }
    }

    @Test
    void addGuest(){
        //given
        GuestList guestList = new GuestList();
        guestList.setGuests(List.of());
        //when
        boolean actual = guestList.addGuest("Stephan");
        //then
        assertTrue(actual);
        assertEquals(List.of("Stephan"), guestList.getGuests());
    }

}