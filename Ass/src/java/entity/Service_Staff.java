/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.List;
import javax.annotation.Resource;
import javax.persistence.*;

/**
 *
 * @author Yew
 */

public class Service_Staff{
    
@PersistenceContext
EntityManager mgr;
@Resource
Query query;

    public Service_Staff(EntityManager mgr) {
        this.mgr = mgr;
    }

    /**
     *
     * @param staff
     * @return
     */
    public boolean addStaff(Staff staff) {
        mgr.persist(staff);
        return true;
    }

    public Staff findStaffByid(String staffId) {
        Staff staff = mgr.find(Staff.class, staffId);
        return staff;
    }

    public boolean deleteStaff(String staffId) {
        Staff staff = findStaffByid(staffId);
        if (staff != null) {
            mgr.remove(staff);
            return true;
        }
        return false;
    }

    public List<Staff> findAll() {
        List staffList = mgr.createNamedQuery("Staff.findAll").getResultList();
        return staffList;
    }

    public boolean updateStaff(Staff staff) {
        Staff tempStaff = findStaffByid(staff.getStaffId());
        if (tempStaff != null) {   
            tempStaff.setStaffName(staff.getStaffName());
            tempStaff.setStaffPosition(staff.getStaffPosition());
            tempStaff.setStaffPass(staff.getStaffPass());
            return true;
        }
        return false;
    }
    
}
