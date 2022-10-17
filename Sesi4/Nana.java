/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Nana extends Hero{
    
    public void SuaraHero(){
        super.SuaraHero();
        System.out.println("Meow Meow Meow");
    }

    public static void main(String[] args) {
        Nana a = new Nana();

        a.SuaraHero();
    }
    
}
