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
public abstract class User {
    protected String email;
    protected String role;

    public User(String email, String role) {
        this.email = email;
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public String getRole() {
        return role;
    }

    public abstract void showDashboard();
}


