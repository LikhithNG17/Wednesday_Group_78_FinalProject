/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.InventoryRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class InventoryOrganization extends Organization {
    public InventoryOrganization() {
        super(Type.Inventory.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new InventoryRole());
        return roles;
    }
    
}
