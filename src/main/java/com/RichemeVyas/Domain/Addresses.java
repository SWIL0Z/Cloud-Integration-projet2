package com.RichemeVyas.Domain;

import java.util.ArrayList;
import java.util.List;

public class Addresses {
    static private List<Address> addresses = new ArrayList<>();

    static public String addAddress(Address newAddress){
        if (!Users.exists(newAddress.getOwner()))
            return "This user does not exist. Address not saved.";
        addresses.add(newAddress);
        return "Address <" + newAddress.toString() + "> saved successfull.";
    }
}
