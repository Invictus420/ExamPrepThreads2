/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadsObserver;

import randomperson.RandomUser;

/**
 *
 * @author Alex
 */
public interface IObserver {
    
    void dataReady(RandomUser user);
}
