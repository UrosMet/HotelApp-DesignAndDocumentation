/***********************************************************************
 * Module:  Restoran.java
 * Author:  Uros
 * Purpose: Defines the Class Restoran
 ***********************************************************************/
package entity;
import java.util.*;

/** @pdOid 0039f45e-6897-4746-bae2-356bdf08ef46 */
public abstract class Restoran {
   /** @pdOid 28e25e61-ad6e-4f7b-8e79-c7248dd203bd */
   private int idUsluga;
   /** @pdOid 8322d3fb-eccc-4472-b96a-0f7ace7495b5 */
   private double cena;
   
   /** @pdOid e40479e3-8c8d-49da-b85a-575ffe372f5e */
   public Restoran() {
      // TODO: implement
   }
   
   /** @pdOid c64b74d5-9057-49e9-8ef9-1d7614df9145 */
   public int getIdUsluga() {
      return idUsluga;
   }
   
   /** @param newIdUsluga
    * @pdOid 12d08477-5538-41b0-92ca-8b98222266b9 */
   public void setIdUsluga(int newIdUsluga) {
      idUsluga = newIdUsluga;
   }
   
   /** @pdOid d1d87e2d-01c7-4c14-99bc-8172811ed78b */
   public double getCena() {
      return cena;
   }
   
   /** @param newCena
    * @pdOid 68d06bb3-8712-44d1-882f-1aaa2784fdbf */
   public void setCena(double newCena) {
      cena = newCena;
   }

}