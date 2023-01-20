/***********************************************************************
 * Module:  RezervacijaInterface.java
 * Author:  Uros
 * Purpose: Defines the Interface RezervacijaInterface
 ***********************************************************************/
package entity;
import java.util.*;

/** @pdOid d84208f8-3075-4a61-9af9-c267837739ff */
public interface RezervacijaInterface {
   /** @pdOid a514517d-61ef-4c9b-9459-de862f47f754 */
   void dodajRezervaciju();
   /** @pdOid 0f9c51cd-e37c-462d-9cb2-12e52a79eae9 */
   boolean izbrisiRezervaciju();
   /** @pdOid dda6c8c9-6562-4f04-b29d-613ffa779967 */
   public Rezervacija izmeniRezervaciju();

}