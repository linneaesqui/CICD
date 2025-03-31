import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {

    //Skapa en testklass och utveckla efter TDD.
    //
    //Skapa ett test för en tänkt klass User autogenerera klassen ifrån testklassen
    //
    //Uppdatera testet så att konstruktorn i User får två parametrar av typen String
    //Skriv koden som gör att testet i uppgift 3 blir godkänt och spara parametrarna i två attribut: userName, password. För alla kommande uppgifter gör likadant Red – Green – Refactor
    //
    //Skriv test som hämtar attributet userName
    //
    //Skriv test som hämtar attributet passWord
    //
    //Skriv ett test som ändrar userName


    @Test
    void testGetUserName() {
        User myUser = new User("userName", "password");
        assertEquals("userName", myUser.getUserName());
    }

    @Test
    void testGetPassword() {
        User myUser = new User("userName", "password");
        assertEquals("password", myUser.getPassword());
    }

    @Test
    void testSetUserName() {
        User myUser = new User("userName", "password");
        myUser.setUserName("newUserName");
        assertEquals("newUserName", myUser.getUserName());
    }

}
