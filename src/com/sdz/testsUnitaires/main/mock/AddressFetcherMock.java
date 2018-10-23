package com.sdz.testsUnitaires.main.mock;

import com.sdz.testsUnitaires.main.implem.Address;
import com.sdz.testsUnitaires.main.inter.AddressFetcher;

public class AddressFetcherMock implements AddressFetcher {

    @Override
    public Address fetchAddress(String name) {
        return new Address("Avenue champs-Elysés", "Mathias Dupond", 5, 75005, "Paris");
    }

}
