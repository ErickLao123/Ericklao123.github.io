/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comp603;

/**
 *
 * @author GGPC
 */
public class GUI {
    //references the different panels i haveand also the controller
    public Controller controller;
    public Login login;
    public Exist exist;
    public CasinoPanel CPanel;
    public BlackJackPanel BJPanel;
    
    //makes the gui with the controller, this initializes the login,cpanel and bjpanel
    public GUI(Controller controller)
    {
        this.controller = controller;
        this.login = new Login(this.controller);
        this.CPanel = new CasinoPanel(this.controller);
        this.BJPanel = new BlackJackPanel(this.controller);
    }
}
