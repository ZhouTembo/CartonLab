import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class PackageTest {

    @Test
    public void inPackage(){
        Carton num= new Carton();



        assertEquals(num.packageN(53), 3, "Not right");



    }



}
