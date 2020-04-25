/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul5_kel42;

/**
 *
 * @author ASUS
 */
public class userService {
    private String[][]histories = new String [2][4];
    private String[][] data = new String[2][3];
    private String email, password, roles = "";
    int book;
    //ini namanya constructor yang akan dijalankan setiap class diinisialisasikan
    public userService(String emails, String passwords)
    {
        email = emails;
        password = passwords;
        String[][] data = 
        { 
            {"izzulkhaq75@gmail.com", "12345", "superAdmin"},
            {"alifnabilm@gmail.com", "12345", "user"} 
        };
        String[][] histories =
        {
            {"izzulkhaq75@gmail.com","Fisika Dasar","Dasar Komputer dan Pemrograman","25-04-2020"},
            {"alifnabilm@gmail.com","Dasar Komputer dan Pemrograman","Konsep Jaringan Komputer","25-04-2020"}
        };
        this.data = data;
        this.histories = histories;
    }
    
    private boolean checkCredential()
    {
        for(int i = 0; i < data.length; i++ )
        {
            if(data[i][0].equals(email))
            {
                if(data[i][1].equals(password))
                {
                    if(data[i][0] == histories[i][0])
                        book = i;
                    roles = data[i][2];
                    return true;
                }
            }
        }
        return false;
    }
    
    public void login()
    {
        boolean status = checkCredential();
        if(status == true)
        {
            System.out.println("\nWelcome " + roles);
            System.out.println("Logged it as user email " + email);
            for(int i = 1;i<3;i++){
                System.out.println(histories[book][i]);
            }
            System.out.println("Tanggal Pinjaman : "+histories[book][3]);            
            }
        else
        {
            System.out.println("\nInvalid Login ");
        }
    }
}