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
public class Trainer extends User {

    public Trainer(String email) {
        super(email, "Trainer");
    }

    @Override
    public void showDashboard() {
        // Implementasi dashboard untuk Trainer
      DashboardTrainer dashboardTrainer = new DashboardTrainer();
        dashboardTrainer.setVisible(true);

    }
}