package com.sdz.testsUnitaires.main.test;

import static org.junit.Assert.*;

import com.sdz.testsUnitaires.main.implem.AddressDisplayerImpl;
import com.sdz.testsUnitaires.main.inter.AddressDisplayer;
import com.sdz.testsUnitaires.main.mock.AddressFetcherMock;

import org.junit.BeforeClass;
import org.junit.Test;

public class AddressDisplayerTest {

    private static AddressDisplayer sut;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        sut = new AddressDisplayerImpl();
        sut.setAddressFetcher(new AddressFetcherMock());
    }

    @Test
    public void testDisplayAddress() {
        String resutlatTheorique = "Mathias Dupond\n5 Avenue champs-Elysés\n75005 Paris";
        String ResultatPratique = sut.displayAddress("Dupond");
        assertTrue(ResultatPratique.compareTo(resutlatTheorique) == 0);
    }

}
