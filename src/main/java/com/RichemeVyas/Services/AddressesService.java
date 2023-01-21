package com.RichemeVyas.Services;

import com.RichemeVyas.Domain.Address;
import com.RichemeVyas.Domain.Addresses;

public class AddressesService {
    public String addNewAddress(Address newAddress){
        return Addresses.addAddress(newAddress);
    }
}
