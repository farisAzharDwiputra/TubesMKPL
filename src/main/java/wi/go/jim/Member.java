/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wi.go.jim;

/**
 *
 * @author Farrel Haykal
 */
public class Member extends User {

    public Member(String email) {
        super(email, "Member");
    }

    @Override
    public void showDashboard() {
         DashboardMember dashboardLogin = new DashboardMember();
                dashboardLogin.setVisible(true);
    }
}



