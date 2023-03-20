/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Role;

import System.ApplicationSystem;
import System.Branch;
import System.UserAccount;
import UI.SystemAdminPanel.SystemAdminJFrame;
import javax.swing.JFrame;



/**
 *
 * @author 91730
 */
public class SystemAdminRole extends Role {

    @Override
    public JFrame createWorkArea(ApplicationSystem appSystem, Branch branch, UserAccount useraccount) {
        return new SystemAdminJFrame(appSystem, branch, useraccount);
    }
    
}
