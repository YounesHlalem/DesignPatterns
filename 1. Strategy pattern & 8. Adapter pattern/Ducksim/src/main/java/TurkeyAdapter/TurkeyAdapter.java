/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TurkeyAdapter;

import edu.ap.younes.ducksim.Duck;

/**
 *
 * @author Younes
 */
public class TurkeyAdapter extends Duck{
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void performFly() {
        for (int i = 0; i < 3; i++) {
            turkey.fly();
        }
    }

    @Override
    public void performQuack() {
        turkey.gobble();
    }

    @Override
    public void display() {
        System.out.println("Im a turkey");
    }
    
    
}
