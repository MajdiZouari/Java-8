package com.sdz.testsUnitaires.main.inter;

import com.sdz.testsUnitaires.main.implem.Address;
/**
 * Created by MZouari on 18/01/2019.
 */
public interface AddressFetcher {
    Address fetchAddress(String name);
}
