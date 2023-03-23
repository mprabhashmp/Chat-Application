
package interfaces;

import java.io.Serializable;

/**
 *
 * @author MSI
 */
public class ChatClient implements Serializable{
    
    
    
    int id;
    String username;
    String nickname;
    String email;
  

    public ChatClient(int id, String username, String nickname, String email) {
        this.id = id;
        this.username = username;
        this.nickname = nickname;
        this.email = email;
       
    }

    
    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getNickname() {
        return nickname;
    }

    public String getEmail() {
        return email;
    }


    
    
    
    
    
    
}
