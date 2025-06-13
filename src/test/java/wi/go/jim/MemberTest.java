package wi.go.jim;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MemberTest {

    private CekMember member;

    @BeforeClass
    public static void setUpClass() throws Exception {
        // Jika perlu inisialisasi global sebelum semua test
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        // Jika perlu bersihkan resource setelah semua test
    }

    @Before
    public void setUp() {
        // Inisialisasi objek sebelum setiap test
        member = new CekMember("user@example.com", "member", "Jane Doe");
    }

    @After
    public void tearDown() throws Exception {
        // Bersihkan setelah test jika perlu
    }

    @Test
    public void testEmailGetter() {
        String expectedEmail = "user@example.com"; 
        String actualEmail = member.getEmail();
        assertEquals("Email harus sesuai", expectedEmail, actualEmail);
    }

    @Test
    public void testRoleGetter() {
        String expectedRole = "member";
        String actualRole = member.getRole();
        assertEquals("Role harus sesuai", expectedRole, actualRole);
    }

    @Test
    public void testNameGetter() {
        String expectedName = "Jane Doe"; 
        String actualName = member.getName();
        assertEquals("Nama harus sesuai", expectedName, actualName);
    }

    @Test
    public void testDashboardOutput() {
        // Tes fungsi showDashboard() hanya untuk memastikan tidak terjadi error
        member.showDashboard(); // Tidak perlu assert jika hanya tes tidak error
    }
}
