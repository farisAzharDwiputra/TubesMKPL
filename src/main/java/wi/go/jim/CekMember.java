/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wi.go.jim;

public class CekMember extends User {
    private String name;

    public CekMember(String email, String role, String name) {
        super(email, role);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void showDashboard() {
        System.out.println("Menampilkan dashboard dari CekMember");
    }
}

